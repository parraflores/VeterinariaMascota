package entidades;
// Generated 24/06/2019 07:58:37 PM by Hibernate Tools 4.3.1



/**
 * ClientepormascotaId generated by hbm2java
 */
public class ClientepormascotaId  implements java.io.Serializable {


     private int clienteIdCliente;
     private int mascotaIdMascota;

    public ClientepormascotaId() {
    }

    public ClientepormascotaId(int clienteIdCliente, int mascotaIdMascota) {
       this.clienteIdCliente = clienteIdCliente;
       this.mascotaIdMascota = mascotaIdMascota;
    }
   
    public int getClienteIdCliente() {
        return this.clienteIdCliente;
    }
    
    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }
    public int getMascotaIdMascota() {
        return this.mascotaIdMascota;
    }
    
    public void setMascotaIdMascota(int mascotaIdMascota) {
        this.mascotaIdMascota = mascotaIdMascota;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClientepormascotaId) ) return false;
		 ClientepormascotaId castOther = ( ClientepormascotaId ) other; 
         
		 return (this.getClienteIdCliente()==castOther.getClienteIdCliente())
 && (this.getMascotaIdMascota()==castOther.getMascotaIdMascota());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getClienteIdCliente();
         result = 37 * result + this.getMascotaIdMascota();
         return result;
   }   


}


