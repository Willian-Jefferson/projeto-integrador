/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package php;

import php.*;
import php.*;
import php.*;
import php.*;
import php.*;
import php.*;
import php.*;

/**
 *
 * @author ALUNO
 */
public class comparacaophp extends javax.swing.JFrame {

    /**
     * Creates new form ifphp
     */
    public comparacaophp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 80));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 920, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Comparação");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("     Operadores de comparação, como os seus nomes implicam, permitem que você compare dois valores. Você pode se interessar em ver as tabelas de comparação de tipos, que tem exemplo das várias comparações entre tipos relacionadas.\n\n     Operadores de comparação\n\n Exemplo:\tNome:\t                        Resultado:\n $a == $b\tIgual\t                        Verdadeiro (true) se $a é igual a $b.\n $a === $b\tIdêntico                        Verdadeiro (true) se $a é igual a $b, e eles são do mesmo tipo.\n $a != $b\tDiferente                       Verdadeiro se $a não é igual a $b.\n $a <> $b\tDiferente                       Verdadeiro se $a não é igual a $b.\n $a !== $b\tNão idêntico\t                Verdadeiro de $a não é igual a $b, ou eles não são do mesmo tipo.\n $a < $b\tMenor que                \tVerdadeiro se $a é estritamente menor que $b.\n $a > $b\tMaior que\t                Verdadeiro se $a é estritamente maior que $b.\n $a <= $b\tMenor ou igual\t                Verdadeiro se $a é menor ou igual a $b.\n $a >= $b\tMaior ou igual\t                Verdadeiro se $a é maior ou igual a $b.\n $a <=> $b\tSpaceship (nave espacial)\tUm integer menor que, igual a ou maior que zero quando $a é, respectivamente, menor que, igual a ou maior que $b.\n\n      Se comparar um número com uma string ou com strings numéricas, cada string é convertido para um número e então a comparação é realizada numericamente. Essas regras também se aplicam a instrução switch. As conversões de tipo não são realizadas quando a comparação utilizada é === ou !== por esse tipo de comparação envolver valores e tipos.\n\n    <?php\n    var_dump(0 == \"a\"); // 0 == 0 -> true\n    var_dump(\"1\" == \"01\"); // 1 == 1 -> true\n    var_dump(\"10\" == \"1e1\"); // 10 == 10 -> true\n    var_dump(100 == \"1e2\"); // 100 == 100 -> true\n\n    switch (\"a\") {\n    case 0:\n              echo \"0\";\n              break;\n    case \"a\": // nunca é alcançado porque \"a\" já foi combinado com 0\n              echo \"a\";\n              break;\n    }\n    ?>\n\n    <?php\n    // Integers\n    echo 1 <=> 1; // 0\n    echo 1 <=> 2; // -1\n    echo 2 <=> 1; // 1\n\n    // Floats\n    echo 1.5 <=> 1.5; // 0\n    echo 1.5 <=> 2.5; // -1\n    echo 2.5 <=> 1.5; // 1\n\n    // Strings\n    echo \"a\" <=> \"a\"; // 0\n    echo \"a\" <=> \"b\"; // -1\n    echo \"b\" <=> \"a\"; // 1\n\n    echo \"a\" <=> \"aa\"; // -1\n    echo \"zz\" <=> \"aa\"; // 1\n\n   // Arrays\n   echo [] <=> []; // 0\n   echo [1, 2, 3] <=> [1, 2, 3]; // 0\n   echo [1, 2, 3] <=> []; // 1\n   echo [1, 2, 3] <=> [1, 2, 1]; // 1\n   echo [1, 2, 3] <=> [1, 2, 4]; // -1\n\n  // Objects\n  $a = (object) [\"a\" => \"b\"];\n  $b = (object) [\"a\" => \"b\"];\n  echo $a <=> $b; // 0\n\n  $a = (object) [\"a\" => \"b\"];\n  $b = (object) [\"a\" => \"c\"];\n  echo $a <=> $b; // -1\n\n  $a = (object) [\"a\" => \"c\"];\n  $b = (object) [\"a\" => \"b\"];\n  echo $a <=> $b; // 1\n\n  // only values are compared\n  $a = (object) [\"a\" => \"b\"];\n  $b = (object) [\"b\" => \"b\"];\n  echo $a <=> $b; // 1\n\n  ?>\n\n    Para vários tipos, comparações são feitas de acordo com a seguinte tabela (em ordem).\n\n    Comparação com vários tipos\n\nTipo do 1º operando\t   Tipo do 2º operando\t   Resultado\nnull ou string\t                                string\t                               Converte null para \"\", numérico ou comparação l                                                                                                                         éxica \nbool or null\t                                qualquer\t                               Converte para bool, false < true\nobject                                                  object\t                               Classes nativas podem definir como são compa                                                                                                                        radas, classes diferentes são incomparáveis, m                                                                                                                        esma classe - compara propriedades\n                                                                                                                       igual faz arrays, tem sua explicação\nstring, resource ou mumber          string, resource ou number        Transforma strings e resource \narray\t                                array\t                               Array com menos membros é menor, se a chave                                                                                                                       do operando 1 não é encontrada no operando 2,                                                                                                                        então os arrayssão incomparáveis, caso contrári                                                                                                                        o - compara valor por valor.\nobject\t                                qualquer\t                              object é sempre maior\narray\t                                qualquer\t                               array é sempre maior\n\n    \n       Exemplo #1 Comparações de boolean e null\n\n   <?php\n   // Bool e null são sempre comparados como booleanos\n   var_dump(1 == TRUE);  // TRUE - same as (bool)1 == TRUE\n   var_dump(0 == FALSE); // TRUE - same as (bool)0 == FALSE\n   var_dump(100 < TRUE); // FALSE - same as (bool)100 < TRUE\n   var_dump(-10 < FALSE);// FALSE - same as (bool)-10 < FALSE\n   var_dump(min(-100, -10, NULL, 10, 100)); // NULL - (bool)NULL < (bool)-100 is FALSE < TRUE\n   ?>\n \n      Exemplo #2 Transcrição do padrão de comparação de array\n\n   <?php\n   // Arrays são comparados assim quando utilizando-se os operadores padrão\n   function standard_array_compare($op1, $op2)\n   {\n       if (count($op1) < count($op2)) {\n          return -1; // $op1 < $op2\n   }   elseif (count($op1) > count($op2)) {\n         return 1; // $op1 > $op2\n   }\n     foreach ($op1 as $key => $val) {\n         if (!array_key_exists($key, $op2)) {\n             return null; // uncomparable\n         } elseif ($val < $op2[$key]) {\n            return -1;\n         } elseif ($val > $op2[$key]) {\n             return 1;\n         }\n     }\n     return 0; // $op1 == $op2\n }\n ?>\n \n \n      Aviso:\n\n     Comparison of floating point numbers\n\n     Por conta da forma que floats são representados internamente não se deve testar dois floats com o comparador de igualdade.\n    Veja a documentação de float para mais detalhes.\n\n    Operador Ternário ¶\n\nOutro operador condicional é o operador \"?:\" (ou ternário).\n\n   Exemplo #3 Atribuindo um valor padrão\n\n  <?php\n  // Example usage for: Ternary Operator\n  $action = (empty($_POST['action'])) ? 'default' : $_POST['action'];\n\n  // The above is identical to this if/else statement\n  if (empty($_POST['action'])) {\n     $action = 'default';\n  } else {\n     $action = $_POST['action'];\n  }\n\n ?>\n\n   A expressão (expr1) ? (expr2) : (expr3) é avaliada para expr2 se expr1 é avaliada como true, ou expr3 se expr1 é avaliada como false.\nDesde o PHP 5.3 é possível deixar vazia a parte central do operador ternário. A   expressão expr1 ?: expr3 retorna expr1 se expr1 verdade true e expr3 do contrário.\n\n   Nota: Note que o operador ternário é uma expressão, e ele não é avaliado para uma variável, mas para o resultado de uma expressão. Isto é importante saber se você quer retornar uma variável por referência. A declaração return $var == 42 ? $a : $b; em uma função que retorna por referência conseqüêntemente não irá \n      funcionar e será avisado.\n\n  Nota:\n\n   É recomendado para evitar \"stacking\" de expressões ternárias. O comportamento do PHP quando usando mais de um operador ternário no único comando não é óbvio:\n\n      Exemplo #4 Comportamento não óbvio do ternário\n\n <?php\n // o seguinte aparenta imprimir 'true'\n echo (true?'true':false?'t':'f');\n\n // conteudo, a saída acima é 't'\n // isto por causa da expressão ternário se avaliada da esquerda pra direita\n\n // o seguinte é a versão mais óbvia do mesmo código acima\n echo ((true ? 'true' : 'false') ? 't' : 'f');\n\n // aqui, você pode ver que a primeira expressão é avaliada para 'true', que\n // por sua vez avalia para (bool)true, assim retornando a parte true da\n // segunda expressão ternária.\n ?>\n Operador Null Coalescing ¶\n Existe ainda o operador \"??\" (ou null coalescing), disponível desde o PHP 7.\n\n Exemplo #5 Atribuindo um valor padrão\n\n <?php\n // Exemplo do operador Null Coalesce\n $action = $_POST['action'] ?? 'default';\n\n // O conteúdo acima é idêntico à essa declaração if/else\n if (isset($_POST['action'])) {\n     $action = $_POST['action'];\n } else {\n     $action = 'default';\n }\n\n ?>\n\n     A expressão (expr1) ?? (expr2) é avaliada para expr2 se expr1 for null, e expr1 do contrário.\nEsse operador em particular não emite aviso caso o valor da esquerda não exista, assim como isset(). Sendo especialmente útil em chaves de arrays.\n\n    Nota: Note que o operador null coalescing é uma expressão, e ele não é avaliado para uma variável, mas para o resultado de uma expressão. Isto é importante saber se você quer retornar uma variável por referência. A declaração return $foo ?? $bar; em uma função que retorna por referência conseqüêntemente não irá funcionar e será avisado.\n\n  Nota:\n\n    Note que o operador null coalescing permite a criação de aninhamentos simples:\n\n  Exemplo #6 Aninhando o operador null coalescing\n\n <?php\n\n $foo = null;\n $bar = null;\n $baz = 1;\n $qux = 2;\n\n echo $foo ?? $bar ?? $baz ?? $qux; // exibe 1\n\n ?>");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 660, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tapet-navy-silver.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  voltar
        
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Tela Logicos php
        
        new logicophp().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Tela Atribuição php
        
        new atribuicaophp().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(comparacaophp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comparacaophp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comparacaophp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comparacaophp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comparacaophp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
