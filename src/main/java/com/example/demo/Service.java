package com.example.demo;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    String getName() {
        return repository.getNameFromDb()+" shetty";
    }
}
