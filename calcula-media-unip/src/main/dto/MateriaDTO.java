package main.dto;

public class MateriaDTO {

   private String     nomeMateria;
   private double     media;
   private StatusEnum status;

   public String getNomeMateria() {
      return nomeMateria;
   }

   public void setNomeMateria(String nomeMateria) {
      this.nomeMateria = nomeMateria;
   }

   public double getMedia() {
      return media;
   }

   public void setMedia(double media) {
      this.media = media;
   }

   public StatusEnum getStatus() {
      return status;
   }

   public void setStatus(StatusEnum status) {
      this.status = status;
   }

   public MateriaDTO(String nomeMateria, double media, StatusEnum status) {
      this.nomeMateria = nomeMateria;
      this.media = media;
      this.status = status;
   }
}
