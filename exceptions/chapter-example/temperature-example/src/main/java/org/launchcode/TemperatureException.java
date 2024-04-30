package org.launchcode;

public class TemperatureException {
    // Write code here!
    class InvalidFileNameException extends Exception {
        public InvalidFileNameException(String message) {
            super(message);
        }
    }

    public int CheckFileExtension(String fileName) throws InvalidFileNameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileNameException("File name cannot be null or empty.");
        }
        return fileName.endsWith(".java") ? 1 : 0;
    }

}
