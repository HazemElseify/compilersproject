/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;
public class TokenData {
    public int lineNo;
    public String lex;
    public String Match;
    public int LexNoInLine;
    public String Ret;
public TokenData() {
    }
    public TokenData(int lineNo, String lex, String Match, int LexNoInLine, String Ret) {
        this.lineNo = lineNo;
        this.lex = lex;
        this.Match = Match;
        this.LexNoInLine = LexNoInLine;
        this.Ret = Ret;
    }
}
