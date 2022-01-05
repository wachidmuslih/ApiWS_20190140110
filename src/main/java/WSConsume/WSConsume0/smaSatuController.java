/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WSConsume.WSConsume0;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wachid
 */
@CrossOrigin
@RestController
@RequestMapping("/datasiswasma")
public class smaSatuController {
    @Autowired
    private smaRepo smarep;

    @GetMapping("/smasatu")
    public List<smasatu> getAllDataSma() {
        return smarep.findAll();
    }

    @GetMapping("/smasatu/{nis}")
    public smasatu getErialbById(@PathVariable String nis) {
        return smarep.findById(nis).get();
    }

    @PostMapping("/smasatu")
    public smasatu smasatuDetails(@RequestBody smasatu c) {
        return smarep.save(c);
    }

    @PutMapping("/smasatu")
    public smasatu updatesmasatu(@RequestBody smasatu c) {
        return smarep.save(c);
    }

    @DeleteMapping("/smasatu/{nis}")
    public ResponseEntity<HttpStatus> deleteSmaSatuById(@PathVariable String nis) {
        smarep.deleteById(nis);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
