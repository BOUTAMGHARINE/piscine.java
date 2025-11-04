

 class UnitConverter {
    static String convert(String[] args) {

        if (args.length != 3) {
            return "Error";
        }

        String from = args[0];
        String to = args[1];
        double value;

        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "Error";
        }

        double result;

        switch (from) {
            case "celsius":
                if (to.equals("fahrenheit")) {
                    result = (value * 9 / 5) + 32;
                } else {
                    return "Error";
                }
                break;

            case "fahrenheit":
                if (to.equals("celsius")) {
                    result = (value - 32) * 5 / 9;
                } else {
                    return "Error";
                }
                break;

            case "kilometers":
                if (to.equals("miles")) {
                    result = value * 0.621371;
                } else {
                    return "Error";
                }
                break;

            case "miles":
                if (to.equals("kilometers")) {
                    result = value / 0.621371;
                } else {
                    return "Error";
                }
                break;

            case "pounds":
                if (to.equals("kilograms")) {
                    result = value * 0.453592;
                } else {
                    return "Error";
                }
                break;


            default:
                return "Error";
        }

        // ✅ Arrondi à 2 décimales
        result = Math.round(result * 100.0) / 100.0;
        return String.format("%.2f", result);
    }

    public static void main(String[] args) {
        System.out.println(UnitConverter.convert(new String[]{"celsius", "fahrenheit", "100"}));     // 212.00
        System.out.println(UnitConverter.convert(new String[]{"fahrenheit", "celsius", "212"}));     // 100.00
        System.out.println(UnitConverter.convert(new String[]{"kilometers", "miles", "5"}));         // 3.11
        System.out.println(UnitConverter.convert(new String[]{"miles", "kilometers", "3.11"}));      // 5.00
        System.out.println(UnitConverter.convert(new String[]{"pounds", "kilograms", "10"}));        // 4.54
        System.out.println(UnitConverter.convert(new String[]{"kilograms", "pounds", "4.54"}));      // 10.00
    }
}


// 212.00
// 100.00
// 3.11
// 4.54
