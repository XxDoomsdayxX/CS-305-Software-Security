// Refractored code
// By: Darrell Walker II
// Date: 9/29/2024

package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}

@RestController
class ServerController{

    // Add hash function to return the checksum value for the data string that contains your name    
    @RequestMapping("/hash")
    public String myHash(){
        String data = "Darrell Walker II";
        String checksum = generateSHA256Checksum(data);
       
        return "<p>Data: " + data + "</p><p>Name of Algorithm: SHA-256   Checksum Value: " + checksum + "</p>";
    }

    // Method to generate SHA-256 checksum
    public String generateSHA256Checksum(String data) {
        try {
            // Create an instance of MessageDigest with SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Generate the checksum (hash value) in byte array format
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            
            // Convert the byte array to hexadecimal format
            return bytesToHex(hash);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error generating checksum.";
        }
    }

    // Method to convert byte array to hexadecimal format
    private String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
