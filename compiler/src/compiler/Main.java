package compiler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static int FindToken(String x, String[] arr){
        for(int i=0;i<arr.length;++i){
            if(x.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    public static boolean isAlpha(char x){
        return (x>='a'&&x<='z')||(x>='A'&&x<='Z'||(x=='_'));
    }
    public static boolean IsIdenChar(char x){
        return (x>='a'&&x<='z')||(x>='A'&&x<='Z')||(x=='_')||(x>='0'&&x<='9');
    }
    public static boolean isIdentifier(String x){
        if(isAlpha(x.charAt(0))){
            for(int i=1;i<x.length();++i){
                if(!IsIdenChar(x.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean IsCons(String x){
        for(int i=0;i<x.length();++i){
            if(x.charAt(i)>='0'&&x.charAt(i)<='9'){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("E:/input.txt");
        Scanner scnr = new Scanner(text);
        String[] Lexemes={"Divisio","InferedFrom","WhetherDo","Else","Ire","Sire","Clo","SetOfClo","FBU","SFBU","NoneValue","TerminateThisNow","RingWhen","BackedValue","STT","Check","CaseOf","Beginning","End","Using"};
        String[] ReturnLexemes={"Class","Inheritance","Condition","Condition","Integer","SInteger","Character","String","Float","SFloat","Void","Break","Loop","Return","Struct","Switch","Switch","Start Statement","End Statement","Inclusion"};
        String[] singleChar={"*","+","-",".",";","@","'","\"","~","[","{","}","]","(",")",","};
        String[] ReturnsingleChar={"Arithmetic Operation","Arithmetic Operation","Arithmetic Operation","Access Operator","Delimiter","Delimiter","Quotation Mark","Quotation Mark","Logic operators","Braces","Braces","Braces","Braces","Braces","Braces","comma"};
        String[] doubleChar={"<=",">=","==","&&","||","!=","<",">","="};
        String[] RetrundoubleChar={"relational operators","relational operators","relational operators","Logic operators","Logic operators","Logic operators","relational operators","relational operators","Assignment operator"};
        int f=0,cnt_line=1;
        while(scnr.hasNextLine()) {
            int st = 0;
            String line = scnr.nextLine();
            if (f == 1) {
                String s = "";
                for (int i = 0; i < line.length() - 1; ++i) {
                    s += line.charAt(i);
                    s += line.charAt(i + 1);
                    if (s.equals("#/")) {
                        System.out.println(1 + " " + "#/" + " Comment");
                        st = i + 2;
                        f = 0;
                        break;
                    }
                    s = "";
                }
                if (f == 1) {
                    continue;
                }
            }
            String token = "";
            int pos_line = 1;
            for (int i = st; i < line.length(); ++i) {
                if (line.charAt(i) == ' ') {
                    continue;
                }
                token += line.charAt(i);
                if (FindToken(String.valueOf(line.charAt(i)), singleChar) != -1) {
                    if (token.length() >= 2) {
                        String check1 = token.substring(token.length() - 2, token.length());
                        if (check1.equals("/-")) {
                            System.out.println((pos_line++) + " " + "/-" + " Comment");
                            break;
                        }
                    }
                    int pos = FindToken(String.valueOf(line.charAt(i)), singleChar);
                    token = token.substring(0, token.length() - 1);
                    if (!token.equals("")) {
                        if (FindToken(token, Lexemes) != -1) {
                            System.out.println((pos_line++) + " " + token + " " + ReturnLexemes[FindToken(token, Lexemes)]);
                        } else if (FindToken(token, doubleChar) != -1) {
                            int cur = FindToken(token, doubleChar);
                            System.out.println((pos_line++) + " " + token + " " + RetrundoubleChar[cur]);
                        } else if (isIdentifier(token)) {
                            System.out.println((pos_line++) + " " + token + " " + "Ident");
                        } else if (IsCons(token)) {
                            System.out.println((pos_line++) + " " + token + " " + "constant");
                        } else {
                            char lst = token.charAt(token.length() - 1);
                            if (lst == '=' || lst == '>' || lst == '<') {
                                token = token.substring(0, token.length() - 1);
                                if (!token.equals("")) {
                                    if (FindToken(token, Lexemes) != -1) {
                                        System.out.println((pos_line++) + " " + token + " " + ReturnLexemes[FindToken(token, Lexemes)]);
                                    } else if (FindToken(token, doubleChar) != -1) {
                                        int cur = FindToken(token, doubleChar);
                                        System.out.println((pos_line++) + " " + token + " " + RetrundoubleChar[cur]);
                                    } else if (isIdentifier(token)) {
                                        System.out.println((pos_line++) + " " + token + " " + "Ident");
                                    } else if (IsCons(token)) {
                                        System.out.println((pos_line++) + " " + token + " " + "constant");
                                    } else {
                                        System.out.println((pos_line++) + " " + token + " " + "error");
                                    }
                                }
                                int cur = FindToken(String.valueOf(lst), doubleChar);
                                System.out.println((pos_line++) + " " + doubleChar[cur] + " " + RetrundoubleChar[cur]);
                            } else {
                                System.out.println((pos_line++) + " " + token + " " + "error");
                            }
                        }
                    }
                    System.out.println((pos_line++) + " " + singleChar[pos] + " " + ReturnsingleChar[pos]);
                    token = "";
                }
                if (token.length() >= 2) {
                    String check1 = token.substring(token.length() - 2, token.length());
                    if (check1.equals("/-")) {
                        System.out.println((pos_line++) + " " + "/-" + " Comment");
                        break;
                    } else if (check1.equals("/#")) {
                        System.out.println((pos_line++) + " " + "/#" + " Comment");
                        f = 1;
                        break;
                    }
                    String check2 = token.substring(token.length() - 2, token.length() - 1);
                    if (FindToken(check1, doubleChar) != -1) {
                        int pos = FindToken(check1, doubleChar);
                        token = token.substring(0, token.length() - 2);
                        if (!token.equals("")) {
                            if (FindToken(token, Lexemes) != -1) {
                                System.out.println((pos_line++) + " " + token + " " + ReturnLexemes[FindToken(token, Lexemes)]);
                            } else if (isIdentifier(token)) {
                                System.out.println((pos_line++) + " " + token + " " + "Ident");
                            } else if (IsCons(token)) {
                                System.out.println((pos_line++) + " " + token + " " + "constant");
                            } else {
                                System.out.println((pos_line++) + " " + token + " " + "error");
                            }
                        }
                        System.out.println((pos_line++) + " " + doubleChar[pos] + " " + RetrundoubleChar[pos]);
                        token = "";
                    } else if (FindToken(check2, doubleChar) != -1) {
                        int pos = FindToken(check2, doubleChar);
                        token = token.substring(0, token.length() - 2);
                       if (!token.equals("")){
                        if (FindToken(token, Lexemes) != -1) {
                            System.out.println((pos_line++) + " " + token + " " + ReturnLexemes[FindToken(token, Lexemes)]);
                        } else if (isIdentifier(token)) {
                            System.out.println((pos_line++) + " " + token + " " + "Ident");
                        } else if (IsCons(token)) {
                            System.out.println((pos_line++) + " " + token + " " + "constant");
                        } else {
                            System.out.println((pos_line++) + " " + token + " " + "error");
                        }
                        System.out.println((pos_line++) + " " + doubleChar[pos] + " " + RetrundoubleChar[pos]);
                        token = "";
                        i--;
                    }
                    }
                }
            }
            cnt_line++;
        }
        }
    }