package com.ylab;

import com.ylab.controller.UserController;
import com.ylab.service.UserServiceImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserServiceImplementation usi = new UserServiceImplementation();
        UserController controller = new UserController(usi);
        Scanner scanner = new Scanner(System.in);

        while (true){
            int nextStep = Integer.parseInt(scanner.next());

            switch (nextStep){
                case 1 ->{

                }

            }
        }
    }
}