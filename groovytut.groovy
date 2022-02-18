class GroovyTut {
    static void main(String[] args){

        // println("Hello World");

        // def age = "Dog";
        // age = 40;

        // println("5 + 4 = " + (5+4));
        // println("5 - 4 = " + (5-4));
        // println("5 * 4 = " + (5*4));
        // println("5 / 4 = " + (5.intdiv(4)));
        // println("5 % 4 = " + (5%4));

        // println("5.2 + 4.4 = " + (5.2.plus(4.4)));
        // println("5.2 - 4.4 = " + (5.2.minus(4.4)));
        // println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
        // println("5.2 / 4.4 = " + (5.2 / 4.4));

        // println("3 + 2 * 5 = " + (3 + 2 * 5));
        // println("(3 + 2) * 5 = " + ((3 + 2) * 5));

        // println("age++ = " + (age++));
        // println("++age = " + (++age));
        // println("age-- = " + (age--));
        // println("--age = " + (--age));

        // println("Biggest Int" + Integer.MAX_VALUE);
        // println("Biggest Int" + Integer.MIN_VALUE);

        // println("Biggest Float" + Float.MAX_VALUE);
        // println("Biggest Float" + Float.MIN_VALUE);

        // println("Biggest Double" + Double.MAX_VALUE);
        // println("Biggest Double" + Double.MIN_VALUE);

        // def randNum = 2.0;
        // println("Math.abs(-2.45) = " + (Math.abs(-2.45)));

        def name = "Derek";

        // println('I am ${name}\n');
        // println("I am ${name}\n");

        // def multString = '''I am a String 
        // that goes on form 
        // many lines''';

        // println(multString);

        // println("3rd Index of Name " + name[3]);
        // println("Index of r " + name.indexOf('r'));

        // println("1st 3 Chars " + name[0..2]);

        // println("Every other char " + name[0,2,4]);

        // println("Substring at 1 " + name.substring(1));

        // println("Substring at 1 to 4 " + name.substring(1,4));

        // println("My Name " + name);
        // println("My Name ".concat(name));

        // println("What I said is " * 2);
        // println("Derek == Derek " + ('Derek'.equals('Derek')));

        // println("Derek == Derek " + ('Derek'.equalsIgnoreCase('derek')));

        // println("Length " + name.length());

        // def repeatStr = "What I said is " * 2;

        // println(repeatStr - "What");
        // println(repeatStr.split(' '));
        // println(repeatStr.toList());

        // println(repeatStr.replaceAll('I', 'she'));

        // println("Uppercase " + name.toUpperCase());
        // println("Lowercase " + name.toLowerCase());

        // println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
        // println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
        // println("Ant <=> Ant " + ('Ant' <=> 'Ant'));

        // def randString = "Random";

        // println("A $randString string");

        // printf("A %s string \n", randString);

        // printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

        // print("whats your name ");
        // def fName = System.console().readLine();
        // println("Hello " + fName);

        // print("Enter a number ");
        // def num1 = 
        // System.console().readLine().toDouble();

        // print("Enter a number ");
        // def num2 = 
        // System.console().readLine().toDouble();

        // printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);

        // def primes = [2,3,5,7,11,13];

        // println("2nd prime " + primes[1]);
        // println("3nd prime " + primes.get(2));

        // def employee = ['Derek', 40, 6.25, [1,2,3]];

        // println("2nd Number " + employee[3][1]);
        // println("Length " + primes.size());

        // primes.add(17);

        // primes<<19;
        // primes.add(23);

        // primes + [29, 31];

        // primes - [31];

        // println("Is Empty " + primes.isEmpty());

        // println("1st 3 " + primes[0..2]);

        // println(primes);

        // println("Matches " + primes.intersect([2,3,7]));

        // println("Reverse " + primes.reverse());
        // println("Sort " + primes.sort());

        // println("Last " + primes.pop());

        // def paulMap = [
        //     'name': 'Paul',
        //     'age': 35,
        //     'address' : '123 Main St',
        //     'list' : [1,2,3]
        // ];

        // println("Name " + paulMap['name']);
        // println("Age " + paulMap.get('age'));
        // println("List Item " + paulMap['list'][1]);

        // paulMap.put('city', 'Pittsburgh');
        // println("Has City " + paulMap.containsKey('city'));
        // println("Size " + paulMap.size());

        // def oneTo10 = 1..10;
        // def aToZ = 'a'..'z';
        // def zToA = 'z'..'a';

        // println(oneTo10);
        // println(aToZ);
        // println(zToA);

        // println("Size " + oneTo10.size());

        // println("2nd Item " + oneTo10.get(1));

        // println("Contains 11 " + oneTo10.contains(11));

        // println("Get Last " + oneTo10.getTo());
        // println("Get First " + oneTo10.getFrom());

        // def ageOld = 6;

        // if(ageOld == 5){
        //     println("Go to Kindergarden");

        // } else if((ageOld > 5) && (ageOld < 18)){
        //     printf("Go to grade %d \n", (ageOld - 5));
        // } else {
        //     println("Go to college");
        // }

        // def canVote = true;

        // println(canVote ? "Can Vote" : "Can't Vote");

        // switch(ageOld) {
        //     case 16: println("You can drive");
        //     case 18: 
        //         println("you can vote");
        //         break;
        //         default: println("Have Fun");
        // }

        // switch(ageOld){
        //     case 0..6 : println("Toddler"); break;
        //     case 7..12 : println("Child"); break;
        //     case 0..6 : println("Teenager"); 
        //     break;
        //     default : println("Adult");
        // }

        // def i = 0;

        // while(i < 10){
        //     if(i % 2){
        //         i++;
        //         continue;
        //     }
        //     if(i == 8){
        //         break;
        //     }

        //     println(i);
        //     i++;
        // }

        // for(i = 0; i < 5; i++){
        //     println(i);
        // }

        // for(j in 2..6){
        //     println(j);

        // }

        // def randList = [10,12,13,14];

        // for(j in randList){
        //     println(j);
        // }

        // def custs = [
        //     100: "Paul",
        //     101: "Sally",
        //     102: "Sue"
        // ];

        // for(cust in custs){
        //     println("$cust.value : $cust.key");
        // }

    //     sayHello();

    //     println("5 + 4 = " + getSum(5,4));


    // }

    // static def sayHello(){
    //     println("Hello");
    // }

    // static def getSum(num1=0,num2=0){
    //     return num1 + num2;
    // }

    // def myName = "Derek";
    // passByValue(myName);
    // println("In Main " + myName);
    // }

    // static def passByValue(name){
    //     name = "In Function";
    //     println("Name : " + name);

        // def listToDouble = [1,2,3,4];
        // listToDouble = doubleList(listToDouble);
        // println(listToDouble);

    //     def nums = sumAll(1,2,3,4);
    //     println("Sum : " + nums);
    // }

    // static def sumAll(int... num){
    //     def sum = 0;
    //     num.each { sum += it; }
    //     return sum;
    // }

    // def fact4 = factorial(4);
    // println("Factorial 4 : " + fact4);

    // }

    // static def factorial(num){
    //     if(num <= 1){
    //         return 1;
    //     } else {
    //         return (num * factorial(num - 1));
    //     }

    // def getFactorial = {num -> (num <= 1 ? 1 : num * call(num - 1))}

    // println("Factorial 4 : " + getFactorial(4));

    // def greeting = "Goodbye";

    // def sayGoodbye = {theName -> println("$greeting $theName")}

    // sayGoodbye("Derek");

    // def numList = [1,2,3,4];
    // numList.each {println(it)};

    // def employees = [
    //     'Paul': 34,
    //     'Sally': 35,
    //     'Sam': 36
    // ];

    // employees.each {println("$it.key : $it.value")};

    // def randNums = [1,2,3,4,5,6];
    // randNums.each { num -> if(num % 2 == 0) 
    // println(num)};

    // def namelist = ["Doug", "Salley", "sue"];

    // def matchEle = namelist.find {item -> item == "sue"}

    // println(matchEle);

    // def randNumList = [1,2,3,4,5,6];
    // def numMatches = randNumList.findAll {item -> item > 4}
    // println(numMatches);

    // println("> 5 : " + randNumList.any {item -> item > 5});

    // println("> 1 : " + randNumList.every {item -> item > 1});

    // println("Double : " + randNumList.collect {item -> item * 2});

    // def getEven = {num -> return(num % 2 == 0)}
    // def evenNums = listEdit(randNumList, getEven);
    // println("Evens : " + evenNums);

    // }

    // static def listEdit(list, clo){
    //     return list.findAll(clo);
    // }

    // new File("test.txt").eachLine {
    //     line -> println "$line";
    // }

    // new File("test.txt").withWriter('utf-8') {
    //     writer -> writer.writeLine("Line 4");
    // }

    // File file = new File("test.txt");
    // file.append('Line 5');

    // println(file.text);

    // println("File Size : ${file.length()} bytes");

    // println("File : ${file.isFile()}");
    // println("Dir : ${file.isDirectory()}");

    // def newFile = new File("test2.txt");
    // newFile << file.text;

    // newFile.delete();

    // def dirFiles = new File("").listRoots();

    // dirFiles.each {
    //     item -> println file.absolutePath;
    // }

    def king = new Animal('King', 'Growl');

    println("$king.name says $king.sound");

    king.setSound('Grrrrr');

    println("$king.name says $king.sound");

    king.run();

    println(king.toString());

    def grover = new Dog('Grover', 'Grr', 'Derek');

    king.makeSound();
    grover.makeSound();

    }

}