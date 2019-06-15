package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class JPARunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*repo.save(new Product(22,"AAA",88.0));
		repo.save(new Product(23,"ABB90",64.0));
		repo.save(new Product(24,"Cofee",86.0));
		repo.save(new Product(14,"Butter",888.0));
		repo.save(new Product(17,"CUP",89.0));
		repo.save(new Product(18,"Biscuit",823.0));
		*/
			// update call
		//repo.save(new Product(17,"Milk",60.0));
		
		// bulk insertion
		/*List<Product> prod=Arrays.asList(new Product(1,"rice",7.4),
				(new Product(2,"rice",8.4)),
			     (new Product(8,"Flour",9.4))
				,(new Product(3,"peddy",5.4)),
				(new Product(5,"almond",2.4)));
             repo.saveAll(prod);*/	
             
             //fetch one row
			/*Optional<Product> p=repo.findById(8);
			if(p.isPresent()) {
			Product prd= p.get();
			System.out.println(prd.getProdCode());
			}else {
				
				System.out.println("not found");
			}
             */
		
          // fetch all row data
            //List<Product> pd=repo.findAll();
           // pd.forEach(System.out::println);
            //System.out.println(pd);
            
            // delete one row
            //repo.deleteById(22);
            
            // delete multi row
            //repo.deleteAll();
            repo.deleteAllInBatch();
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		