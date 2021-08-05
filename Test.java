package sample;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x=0;
        Scanner sc = new Scanner(System.in);
        String r ="Ответьте на вопросы, выбрав один из варинтов ответов:";
        String [] qwestion ={"Кто умеет мяукать?","у кого длинные уши?", "Кто умеет бегать"};
        String[] correctAnswers ={"Кошка", "Заяц", "Собака"};
        String[] correctAnswers1 ={"кошка", "заяц", "собака"};
        String answerOption1 = "- Собака" +"\n"+ "- Кошка"+"\n"+ "- Петух";
        String answerOption2 = "- Заяц" + "\n"+ "- Курица" +"\n" + "- Верблюд";
        String answerOption3 = "- Змея"+"\n"+"- Собака"+"\n"+"- Гусеница";

System.out.println(r);
System.out.println(qwestion[0]);
System.out.println(answerOption1);
       String  answer= sc.nextLine();

       if (answer.equals(correctAnswers[0])){
           x+=1;
       }
       if (answer.equals(correctAnswers1[0])){
           x+=1;
       }

        System.out.println(qwestion[1]);
        System.out.println(answerOption2);
        String answer2 = sc.nextLine();

        if (answer2.equals(correctAnswers[1])){
            x+=1;
        }
        if (answer2.equals(correctAnswers1[1])){
            x+=1;
        }

        System.out.println(qwestion[2]);
        System.out.println(answerOption3);
        String answer3 = sc.nextLine();

        if (answer3.equals(correctAnswers[2])){
            x+=1;
        }
        if (answer3.equals(correctAnswers1[2])){
            x+=1;
        }
        System.out.println("Количество правильных ответов:"+ x);

    }
}


