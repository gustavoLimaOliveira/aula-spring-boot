package br.com.fiap.pettech.pet_tech;

public class ControllerNotFoundException extends  RuntimeException {
    public ControllerNotFoundException(String message) {
        super(message);
    }
}
