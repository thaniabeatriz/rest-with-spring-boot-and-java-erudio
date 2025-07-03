package br.com.thania.request.converters;

import br.com.thania.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if(strNumber == null || strNumber.isEmpty()){
            throw new UnsupportedMathOperationException("Por favor, coloque um valor numérico!");
        }
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()){
            return false;
        }
        String number = strNumber.replace(",",".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }

}
