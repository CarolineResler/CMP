//Define the class Node which includes the attributes: Task Name, 
//Time to complete the task, ES, EF, LS, and LF.
package cpm;

/**
 *
 * @author Caroline
 */
public class node {

        private String name;
        private int It;
        private int ES;
        private int EF;
        private int LS;
        private int LF;
        node next;
        node head;

        node(String name, int It, int ES, int EF, int LS, int LF) {
            this.name = name;
            this.It = It;
            this.ES = ES;
            this.ES = EF;
            this.ES = LS;
            this.ES = LF;  
        }
         public void Addto(String name, int It, int ES, int EF, int LS, int LF){ 
        node new_node = new node(name, It, ES, EF, LS, LF); 
        new_node.next = head; 
        head = new_node; 
    }

        public void setName(String data) {
            this.name = name;
        }

        public void setIt(int It) {
            this.It = It;
        }

        public void setES(int ES) {
            this.ES = ES;
        }
        
        public void setEF(int EF) {
            this.EF = EF;
        }
        
        public void setLS(int LS) {
            this.LS = LS;
        }
        
        public void setLF(int LF) {
            this.LF = LF;
        }

        public String getName() {
            return name;
        }

        public int getIt() {
            return It;
        }
        
        public int getES() {
            return ES;
        }
        
        public int getEF() {
            return EF;
        }

        public int getLS() {
            return LS;
        }

        public int getLF() {
            return LF;
        }
    }
