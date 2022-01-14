package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.pet.Pet;
import org.springframework.samples.petclinic.pet.PetType;
import org.springframework.stereotype.Service;

@Service
public class FeedingService {
	@Autowired
	FeedingRepository feedingRepo;
	
    public List<Feeding> getAll(){
        List <Feeding> ls = feedingRepo.findAll();
        return ls;
    }

    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }

    public FeedingType getFeedingType(String typeName) {
        FeedingType f = feedingRepo.findFeedingTypeByName(typeName);
        return f;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return feedingRepo.save(p); 
    }

    
}
