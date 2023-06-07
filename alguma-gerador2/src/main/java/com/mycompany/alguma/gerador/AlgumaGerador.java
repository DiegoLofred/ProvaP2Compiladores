/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alguma.gerador;

/**
 *
 * @author Zen
 */

import com.mycompany.alguma.gerador.AlgumaParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class AlgumaGerador {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lexer = new AlgumaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlgumaParser parser = new AlgumaParser(tokens);
        ProgramaContext arvore = parser.programa();
        AlgumaSemantico as = new AlgumaSemantico();
        as.visitPrograma(arvore);
        AlgumaSemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        
        if(AlgumaSemanticoUtils.errosSemanticos.isEmpty()) {
            AlgumaGeradorC agc = new AlgumaGeradorC();
            agc.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
            
            AlgumaGeradorPcodigo agp = new AlgumaGeradorPcodigo();
            String pcod = agp.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[2])) {
                pw.print(pcod);
            }
        }
    }
}
