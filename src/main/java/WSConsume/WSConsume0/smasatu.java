/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WSConsume.WSConsume0;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author wachid
 */
@Entity
@Table(name="datasiswa")
@Data
@AllArgsConstructor
@NoArgsConstructor
class smasatu {
    @Id
    private String nis;
    private String nama;
    private String jurusan;
    private String kelas;
}
