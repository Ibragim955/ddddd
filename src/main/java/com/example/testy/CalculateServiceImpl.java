package com.example.testy;

public class CalculateServiceImpl implements CalculateSevice{

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int minus(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return 0;
        } else if (number1 == 0) {
            return 0;
        } else if (number2 == 0) {
            return 0;
        } else if (number2 > number1) {
            return 0;
        }
        return number1 - number2;
    }

    @Override
    public int multiplay(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return 0;
        } else if (number1 == 0) {
            return 0;
        } else if (number2 == 0) {
            return 0;

        }
        return number1 * number2;

    }
    @Override
    public int devide(Integer number1, Integer number2) throws InCorrectArgumentsExeptions {
        if (number1 == 0) {
            throw new InCorrectArgumentsExeptions("Ощибка ....");
        }
        return number1 / number2;
    }

}