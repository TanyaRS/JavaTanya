package sample;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x=0;
        Scanner sc = new Scanner(System.in);
        String r ="�������� �� �������, ������ ���� �� �������� �������:";
        String [] qwestion ={"��� ����� �������?","� ���� ������� ���?", "��� ����� ������"};
        String[] correctAnswers ={"�����", "����", "������"};
        String[] correctAnswers1 ={"�����", "����", "������"};
        String answerOption1 = "- ������" +"\n"+ "- �����"+"\n"+ "- �����";
        String answerOption2 = "- ����" + "\n"+ "- ������" +"\n" + "- �������";
        String answerOption3 = "- ����"+"\n"+"- ������"+"\n"+"- ��������";

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
        System.out.println("���������� ���������� �������:"+ x);

    }
}


