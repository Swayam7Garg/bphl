package com.swayam.bphl.service.impl;

import com.swayam.bphl.dto.BfhlRequest;
import com.swayam.bphl.dto.BfhlResponse;
import com.swayam.bphl.service.BfhlService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    private static final String USER_ID = "swayam_garg_13012005";
    private static final String EMAIL = "swayamgarg231225@acropolis.in";
    private static final String ROLL_NUMBER = "0827CD231067";

    @Override
    public BfhlResponse processRequest(BfhlRequest request) {
        if (request == null || request.getData() == null) {
            return BfhlResponse.builder()
                    .success(false)
                    .userId(USER_ID)
                    .email(EMAIL)
                    .rollNumber(ROLL_NUMBER)
                    .evenNumbers(List.of())
                    .oddNumbers(List.of())
                    .alphabets(List.of())
                    .specialCharacters(List.of())
                    .sepcialCharacters(List.of())
                    .sum("0")
                    .concatString("")
                    .build();
        }

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO;

        for (String item : request.getData()) {
            if (item == null) continue;
            
            // Check if purely numeric
            if (item.matches("^\\d+$")) {
                BigInteger val = new BigInteger(item);
                sum = sum.add(val);
                if (val.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }
            } 
            // Check if purely alphabetical
            else if (item.matches("^[a-zA-Z]+$")) {
                alphabets.add(item.toUpperCase());
            } 
            // Otherwise, special character
            else {
                specialCharacters.add(item);
            }
        }

        String concatString = computeConcatString(request.getData());

        return BfhlResponse.builder()
                .success(true)
                .userId(USER_ID)
                .email(EMAIL)
                .rollNumber(ROLL_NUMBER)
                .evenNumbers(evenNumbers)
                .oddNumbers(oddNumbers)
                .alphabets(alphabets)
                .specialCharacters(specialCharacters)
                .sepcialCharacters(specialCharacters)
                .sum(sum.toString())
                .concatString(concatString)
                .build();
    }

    private String computeConcatString(List<String> data) {
        StringBuilder letters = new StringBuilder();
        for (String item : data) {
            if (item == null) continue;
            for (char ch : item.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.append(ch);
                }
            }
        }
        
        String reversed = letters.reverse().toString();
        StringBuilder alternatingCaps = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (i % 2 == 0) {
                alternatingCaps.append(Character.toUpperCase(ch));
            } else {
                alternatingCaps.append(Character.toLowerCase(ch));
            }
        }
        
        return alternatingCaps.toString();
    }
}
