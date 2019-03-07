package coop.tecso.examen.controller;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@WebMvcTest(CountryController.class)
public class CountryControllerTest {

//	@Autowired
//    private MockMvc mvc;
//	
//	@Autowired
//	private CountryController controller;
//	    
//    @MockBean
//    private CountryRepository myRepository;
//    
//    
//    @Test
//    public void findAllWithEmptyResult() throws Exception {
//    	
//    	when(myRepository.findAll()).thenReturn(Collections.emptyList());
//    	
//    	String root = controller.getClass().getAnnotation(RequestMapping.class).value()[0];
//        
//    	mvc.perform(get(root +"/findAll"))
//    							.andDo(print())
//    							.andExpect(status().isOk())
//    							.andExpect(jsonPath("$", hasSize(0)))
//    							.andReturn();	
//    }
//    
//    @Test
//    public void findAllWithOneResultElement() throws Exception {
//    	
//    	Long id = 1L;
//    	String isoCode = "XXX";
//    	String name = "ZZZZZZ";
//    	
//    	Country element = new Country();
//    	element.setId(id);
//    	element.setIsoCode(isoCode);
//    	element.setName(name);
//    	
//    	when(myRepository.findAll()).thenReturn(Arrays.asList(element));
//    	
//    	String root = controller.getClass().getAnnotation(RequestMapping.class).value()[0];
//        
//    	mvc.perform(get(root +"/findAll"))
//    							.andDo(print())
//    							.andExpect(status().isOk())
//    							.andExpect(jsonPath("$", hasSize(1)))
//    							.andExpect(jsonPath("$[0].id", is(id.intValue())))
//    							.andExpect(jsonPath("$[0].isoCode", is(isoCode)))
//    							.andExpect(jsonPath("$[0].name", is(name)))
//    							.andReturn();	
//    }
	
}
