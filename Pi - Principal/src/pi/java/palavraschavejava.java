/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.java;

import TelaPrincipalTodas.TelaPrincipal;
import portugol.Introducao;

/**
 *
 * @author ALUNO
 */
public class palavraschavejava extends javax.swing.JFrame {

    public static Object java() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form historia
     */
    public palavraschavejava() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1 - abstract\nUm método sem definição deve ser declarado como abstrato(abstract) e a classe que o contém também deve ser declarada como abstrata. Classes abstratas não podem ser instanciadas e os métodos abstratos devem ser implementados nas subclasses. Outro detalhe é que uma classe abstrata não obrigatoriamente tem um método abstrato, mas um método abstrato só pode estar numa classe abstrata.\n\n2 - assert\nO assert descreve um predicado(uma declaração de verdadeiro ou falso) colocado em uma aplicação Java para indicar se o valor passado para o predicado é verdadeiro ou falso. Se a asserção for avaliada como falsa em tempo de execução, ocorrerá uma falha de asserção.\n\n3 - boolean\nDefine uma variável booleana apenas para os valores “true” ou “false”. Por padrão, o valor do tipo primitivo booleano é falso. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo booleano.\n\n4 - break\nUsado para finalizar a execução no corpo do loop atual.\n\n5 - byte\nA palavra chave byte é usada para declarar um campo que pode conter um número inteiro de complemento de dois assinado de 8 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo byte.\n\n6 - case\nUm bloco switch pode ser identificado com um ou mais “case” ou com um identificador “default”. A instrução switch avalia sua expressão e, em seguida executa todas as instruções que seguem o identificador “case” correspondente.\n\n7 - catch\nUtilizado em conjunto com um bloco “try” e em um bloco opcional “finally”. As instruções no bloco “catch” especificam o que fazer se um tipo específico de exceção for lançado pelo bloco “try”.\n\n8 - char\nDefine uma variável de caractere capaz de conter qualquer caractere do conjunto de caracteres suportados pelo Java.\n\n9 - class\nUma palavra que define a implementação de um tipo específico de objeto. Uma definição de classe define variáveis de classe e de instância, métodos e classes internas, além de especificar as interfaces que a classe implementa e a superclasse imediata da classe. Se a superclasse não for especificada explicitamente, a superclasse é implicitamente Object. A palavra chave class também pode ser usada no formato Class.class para obter um objeto Class sem precisar de uma instância dessa classe. Por exemplo, String.class pode ser usado em vez de fazer new String().getClass();.\n\n10 - const\nNão utilizado, porém é reservada.\n\n11 - continue\nUsado para retomar a execução do programa no final do corpo do loop atual. Se seguido por um identificador continue, retoma a execução no final do corpo do loop identificado.\n\n12 - default\nA palavra chave default pode opcionalmente ser usada em uma instrução switch para identificar um bloco de instruções a ser executado se nenhum caso corresponder ao valor especificado. Como alternativa, a palavra chave default também pode ser usada para declarar valores padrão em uma anotação Java. A partir do Java 8, palavra chave default pode ser usada para permitir que uma interface forneça uma implementação de um método.\n\n13 - do\nA palavra chave do é usada em conjunto com o while para criar um loop do-while, que executa um bloco de instruções associadas ao loop e testa uma expressão booleana associada ao while. Se a expressão for avaliada como verdadeira, o bloco será executado novamente, isso continua até que a expressão seja avaliada como falsa.\n\n14 - double\nA palavra chave double é usada para declarar uma variável que pode conter um número de ponto flutuante IEEE 754 de precisão dupla de 64 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo double.\n\n15 - else\nA palavra chave else é usada em conjunto com if para criar uma instrução if-else, que testa uma expressão booleana, se a expressão for avaliada como verdadeira, o bloco de instruções associado ao if será avaliada, se avaliado como falso, o bloco de instruções associado ao else é avaliado.\n\n16 - enum\nA palavra chave enum é usada para declarar um tipo enumerado. Enumerações estendem a classe base Enum.\n\n17 - extends\nUsado em uma declaração de classe para especificar a superclasse, usado em uma declaração de interface para especificar uma ou mais superinterfaces. A classe X estende a classe Y para adicionar funcionalidade, adicionando campos ou métodos a classe Y ou substituindo métodos da classe Y. Uma interface Z estende uma ou mais interfaces adicionando métodos. A classe X é considerada uma subclasse da classe Y. A interface Z é considerada uma subinterface das interfaces que ela se estende. Também usado para especificar um limite superior em um parâmetro de tipo em Generics.\n\n18 - final\nDefine uma entidade uma vez que não possa ser alterada nem derivada posteriormente. Mais especificamente: uma classe final não pode ser subclassificada, um método final não pode ser substituido e uma variável final pode ocorrer no máximo uma vez como uma expressão left-hand em um comando executado. Todos os métodos em uma classe final são implicitamente finais.\n\n19 - finally\nUsado para definir um bloco de instruções para um bloco definido anteriormente pela palavra chave try. O bloco finally é executado após a execução sair do bloco try e de qualquer cláusula catch associada, independentemente de uma execução ter sido lançada ou capturada ou se a execução parou no meio dos blocos try ou catch usando a palavra chave return\n\n20 - float\nA palavra chave float é usada para declarar uma variável que pode conter um número de ponto flutuante IEEE 754 de precisão única de 32 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo float.\n\n21 - for\nA palavra chave for é usada para criar um loop for, que especifica uma inicialização de variável, uma expressão booleana e um incremento. A inicialização da variável é realizada primeiro e, em seguida, a expressão booleana é avaliada. Se a expressão for avaliada como verdadeira, o bloco de instruções associado ao loop será executado. A expressão booleana é então avaliada novamente, isso continua até que a expressão seja avaliada como falsa. A partir do J2SE 5.0, a palavra chave for também pode ser usada para criar o chamado “enhanced for loop” que especifica uma matriz ou objeto iterável, cada iteração do loop executa o bloco de instruções associado usando um elemento diferente na matriz ou Iterable.\n\n22 - goto\nNão utilizada, porém reservado.\n\n23 - if\nA palavra chave if é usada para criar uma instrução if, que testa uma expressão booleana, se a expressão for avaliada como verdadeira, o bloco de instruções associado a instrução if será executado. Essa palavra chave também pode ser usada para criar uma instrução if-else.\n\n24 - implements\nIncluído em uma declaração de classe para especificar uma ou mais interfaces implementadas pela classe atual. Uma classe herda os tipos e métodos abstratos declarados pelas interfaces.\n\n25 - import\nUsado no inicio de um arquivo de código-fonte para especificar classes ou pacotes Java inteiros a serem consultados posteriormente, sem incluir seus nomes de pacotes na referência. Desde o J2SE 5.0, as instruções de importação podem importar membros estáticos de uma classe.\n\n26 - instanceof\nUm operador binário que recebe uma referência de objeto como seu primeiro operando e uma classe ou interface como seu segundo operando e produz um resultado booleano. O operador instanceof avalia como true se e somente se o tipo de tempo de execução do objeto é uma atribuição compatível com a classe ou interface.\n\n27 - int\nA palavra chave int é usada para declarar uma variável que pode conter um inteiro de complemento de dois de 32 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo int.\n\n28 - interface\nUsado para declarar um tipo especial de classe que contém apenas métodos abstratos ou padrão, campos constantes(estáticos, finais) e interfaces estáticas. Posteriormente, ele pode ser implementado por classes que declaram a interface com a palavra chave implements. Como a herança múltipla não é permitida em Java, as interfaces são usadas para contorná-la. Uma interface pode ser definida dentro de outra interface.\n\n29 - long\nA palavra chave long é usada para declarar uma variável que pode conter um inteiro de complemento de dois assinados de 64 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo por muito tempo.\n\n30 - native\nUsado nas declarações do método para especificar que o método não é implementado no mesmo arquivo de código Java, mas em outra linguagem.\n\n31 - new\nUsado para criar uma instância de um objeto de classe ou matriz. O uso da palavra chave para esse fim não é completamente necessário(como exemplificado pelo Scala), embora atenda a dois propósitos: permite a existência de um espaço de nome diferente para métodos e nomes de classes, define estaticamente e localmente que um objeto novo é realmente criado e que tipo de runtime é.\n\n32 - package\nUm pacote Java é um grupo de classes e interfaces semelhantes. Pacotes são declarados com a palavra chave package.\n\n33 - private\nA palavra chave private é usada na declaração de um método, campo ou classe interna, membros privados só podem ser acessados por outros membros de sua própria classe.\n\n34 - protected\nA palavra chave protected é usada na declaração de um método, campo ou classe interna, membros protegidos só podem ser acessados por membros de sua própria classe, subclasses ou classes dessa classe do mesmo pacote.\n\n35 - public\nA palavra chave public é usada na declaração de uma classe, método ou campo, classes públicas, métodos e campos podem ser acessados pelos membros de qualquer classe.\n\n36 - return\nUsado para concluir a execução de um método. Pode ser seguido por um valor exigido pela definição do método que é retornada ao chamador.\n\n37 - short\nA palavra chave short é usada para declarar um campo que pode conter um número inteiro de complemento de dois de 16 bits. Essa palavra chave também é usada para declarar que um método retorna um valor do tipo primitivo short.\n\n38 - static\nUsada para declarar um campo, método ou classe interna como um campo de classe. As classes mantêm uma cópia dos campos da classe independentemente de quantas instâncias existem nessa classe. static também é usado para definir um método como um método de classe. Os métodos de classe são vinculados a classe em vez de a uma instância específica e só podem operar em campos de classe.\n\n39 - strictfp\nUsada para restringir a precisão e o arredondamento dos cálculos de ponto flutuante para garantir a portabilidade.\n\n40 - super\nUsada para obter binding dinâmico ou polimorfismo em tempo de execução. Usado também para acessar membros de uma classe herdada pela classe em que ela aparece. Permite que uma subclasse acesse métodos substituídos e membros ocultos de sua superclasse. A palavra chave super também pode ser usada para encaminhar uma chamada de um construtor para um construtor na superclasse. E também é usado para especificar um limite inferior em um parâmetro de tipo em Generics.\n\n41 - switch\nA palavra chave switch é usada em conjunto com case e default para criar uma instrução switch, que avalia uma variável, combina seu valor com um caso específico e executa o bloco de instruções associado a esse case. Se nenhum case corresponder ao valor, o bloco opcional identificado pelo default será executado.\n\n42 - synchronized\nUsado na declaração de um método ou bloco de código para adquirir o mutex lock para um objeto enquanto a thread atual executa o código. Para métodos estáticos, o objeto bloqueado é a classe Class. Garante que, no máximo exista uma thread de cada vez operando no mesmo objeto e executando esse código. O mutex lock é liberado automaticamente quando a execução sai do código sincronizado. Campos, classes e interfaces não podem ser declarados como synchronized.\n\n43 - this\nUsado para representar uma instância da classe em que aparece. this pode ser usado para acessar os membros da classe e como uma referência a instância atual. A palavra chave this também é usada para encaminhar uma chamada de um construtor em uma classe para outro construtor na mesma classe.\n\n44 - throw\nFaz com que a instância da exceção declarada seja lançada. Isso faz com que a execução continue com o primeiro handler de exceção em anexo declarado pela palavra chave catch para manipular um tipo de exceção compatível com a atribuição. Se nenhum handler de exceção for encontrado no método atual, o método retornará e o processo será repetido no método da chamada. Se nenhum handler de exceções for encontrado em qualquer chamada de método na pilha, a exceção será passada para o handler de exceções não capturadas da thread.\n\n45 - throws\nUsado nas declarações do método para especificar quais exceções não são tratadas no método, mas passadas para o próximo nível mais alto do programa. Todas as exceções não capturadas em um método que não são instâncias de RuntimeException devem ser declaradas usando a palavra chave throws.\n\n46 - transient\nDeclara que um campo de instância não faz parte do formulário serializado padrão de um objeto. Quando um objeto é serializado, apenas os valores de seus campos de instâncias não transitórios são incluídos na representação serial padrão. Quando um objeto é desserializado, os campos transitórios são inicializados apenas com o valor padrão. Se o formulário padrão não for usado, por exemplo, quando uma tabela serialPersistentFields é declarada na hierarquia de classes, todas as palavra chave transient são ignoradas.\n\n47 - try\nDefine um bloco de instruções que possuem manipulação ou handling de exceção. Se uma exceção for lançada dentro do bloco try, um bloco catch opcional poderá manipular os tipos de exceção declarados. Além disso, pode ser declarado um bloco finally opcional que será executado quando a execução sair das cláusulas try e catch, independentemente de uma exceção ser lançada ou não. Um bloco try deve ter pelo menos uma cláusula catch ou um bloco finally.\n\n48 - void\nA palavra chave void é usada para declarar que um método não retorna nenhum valor.\n\n49 - volatile\nUtilizada em declarações de campo para garantir a visibilidade das alterações nas variáveis através das threads. Toda leitura de uma variável volátil será lida na memória principal e não no cache da CPU, e todas as gravações em uma variável volátil serão gravadas na memória principal, e não apenas no cache da CPU. Métodos, classes e interfaces, portanto, não podem ser declarados voláteis, nem variáveis ou parâmetros locais.\n\n50 - while\nA palavra chave while é usada para criar um loop while, que testa uma expressão booleana e executa o bloco de instruções associado ao loop se a expressão for avaliada como verdadeira, isso continua até que a expressão seja avaliada como falsa. Essa palavra chave também pode ser usada para criar um loop do-while.\ntrue, false e null\n\nTemos ainda os casos especiais de palavras reservadas que são usadas para valores literais.\n\ntrue = valor booleano literal para verdadeiro. false = valor booleano literal para falso. null = valor literal de referência.\nidentificadores especiais\n\nvar = identificador especial que não pode ser usado como um nome de tipo(incluído no Java 10). _ = Adicionado no Java 11, o underscore tornou-se uma palavra chave e não pode mais ser usado como nome de variável.\nnão utilizados\n\nconst = embora reservada como palavra chave, const não é usada e não tem função. Para definir constantes em Java é normal utilizarmos a palavra chave final.\n\ngoto = embora reservada como palavra chave, goto não é usado e não tem função.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setText("Palavras-chave");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 391, Short.MAX_VALUE)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(320, 320, 320)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1))
                .add(18, 18, 18)
                .add(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(131, 131, 131)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jButton1))
                        .add(16, 16, 16)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(palavraschavejava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(palavraschavejava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(palavraschavejava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(palavraschavejava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new palavraschavejava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
