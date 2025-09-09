package sn.encvr.gestion_corrier_back_end.dtos;

import lombok.Data;
import sn.encvr.gestion_corrier_back_end.entities.Destinataire;
import sn.encvr.gestion_corrier_back_end.entities.Expediteur;
import sn.encvr.gestion_corrier_back_end.entities.Statut;

import java.time.LocalDate;

@Data
public class CourrierDTO {

    private Long id;

    private String numero;
    private LocalDate dateReception;
    private String objet;

    private Expediteur expediteur;
    private Destinataire destinataire;
    private Statut statut;


}
