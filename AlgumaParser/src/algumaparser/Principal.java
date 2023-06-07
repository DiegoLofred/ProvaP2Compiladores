/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algumaparser;

/**
 *
 * @author Zen
 */
import algumalex.AlgumaLexico;

public class Principal {
    public static void main(String args[]) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        AlgumaParser parser = new AlgumaParser(lex);
        parser.programa();
    }
}
