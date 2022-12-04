package homeworks;

public class Homework06 {
    public static void main(String[] args) {
        /*Task 1


        int[] ints = new int[10];
        ints[2] = 23; ints[4] = 12; ints[7] = 34; ints[9] = 7; ints[6] = 15; ints[0] = 89;
        System.out.println(ints[3]);
        System.out.println(ints[0]);
        System.out.println(ints[9]);
        System.out.println(Arrays.toString(ints));

        Task 2
        String[] strings = new String[5];
        strings[1] = "abc";
        strings[4] = "xyz";
        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));

         Task 3
        int[] ints = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(Arrays.stream(ints).sorted().toArray()));

         Task 4
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(Arrays.stream(countries).sorted().toArray()));

         Task 5
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));
        if(Arrays.asList(dogs).contains("Pluto")){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

         Task 6
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        System.out.println(Arrays.toString(Arrays.stream(cats).sorted().toArray()));
        if(Arrays.asList(cats).contains("Garfield") & Arrays.asList(cats).contains("Felix")){
            System.out.println(true);
        } else{
            System.out.println(false);

         Task 7
        Double[] doubles = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(doubles));
        for (double i : doubles) {
            System.out.println(i);
       Task 8
        int countLetter = 0, countUpper = 0, countLower = 0, countNums = 0, countSC = 0;
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        for (char i: chars
             ) {
            if(Character.isLetter(i)){
                countLetter++;
                if(Character.isUpperCase(i)){
                    countUpper++;
                } else{
                    countLower++;
                }
        }
            else if(Character.isDigit(i)){
                countNums++;
            } else{
                countSC++;
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println("Letters = " + countLetter);
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters = " + countLower);
        System.out.println("Digits = " + countNums);
        System.out.println("Special Characters = " + countSC);


      Task 9
        String[] strings = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(strings));

        int countUpper = 0, countLower = 0, countBp = 0, countBookPen = 0;
        for (int i = 0; i < strings.length; i++) {
            if (Character.isUpperCase(strings[i].charAt(0))) {
                countUpper += 1;
            } else if (Character.isLowerCase(strings[i].charAt(0))) {
                countLower += 1;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].toLowerCase(Locale.ROOT).charAt(0) == ('b') | strings[i].toLowerCase(Locale.ROOT).charAt(0) == 'p') {
                countBp += 1;
            }
        }
        for (String word : strings) {
                 if(word.toLowerCase(Locale.ROOT).contains("book") | word.toLowerCase(Locale.ROOT).contains("pen")){
                     countBookPen += 1;
                 }
             }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starts with B or p = " + countBp);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookPen);

         Task 10
        int[] ints = {3,5,7,10,0,20,17,10,23,56,78};
        int countMore = 0, countLess = 0, count10 = 0;
        System.out.println(Arrays.toString(ints));
        for (int i: ints) {
            if(i > 10){
                countMore++;
            } else if(i < 10){
                countLess++;
            } else{
                count10++;
            }
        }
        System.out.println("Elements that are more than 10 = " + countMore);
        System.out.println("Elements that are less than 10 = " + countLess);
        System.out.println("Elements that are 10 = " + count10);

        Task 11
        int[] ints1 = {5, 8, 13, 1, 2};
        int[] ints2 = {9, 3, 67, 1, 0};
        int[] ints3 = new int[ints2.length];
        for (int i = 0; i < ints1.length ; i++) {
            ints3[i] = (Math.max(ints1[i], ints2[i]));
        }
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));

         */
    }
}

