package dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogDAO service;

    @GetMapping("/AllDogs")
    public List<DogProps> getAllDogs(){
        return service.getAllDogs();
    }

    @GetMapping("/dog/byId/{id}")
    public DogProps getDog(@PathVariable int id){
        return service.getDog(id);
    }


    @GetMapping("/dog/byBreed/{breed}")
    public List<DogProps> getDogs(@PathVariable String breed){
        return service.getDogs(breed);
    }

    @GetMapping("/dog/byActiveLevel/{level1}/{level2}")
    public List<DogProps> getDogs(@PathVariable int level1,@PathVariable int level2){
        return service.getDogs(level1,level2);
    }

    @GetMapping("/dog/byDOB/{DOB}")
    public List<DogProps> getDogs(@PathVariable Date date){
        return service.getDogs(date);
    }

    @PostMapping("/dog")
 /*   public ResponseEntity<Object> postDog(@RequestBody DogProps dog){
        DogProps dogProps=service.addDog(dog);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dogProps.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
*/
    public void addDog(@RequestBody DogProps dog){
        DogProps dogProps=service.addDog(dog);
    }


    @DeleteMapping("/dog/{id}")
    public DogProps delDog(int id){
        return service.delDogs(id);
    }

    @PutMapping("/dog/update/{id}")
    public DogProps updDog(DogProps dogProps){
        return service.updateDog(dogProps);
    }

}