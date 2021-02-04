package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {
  private final AuthorRepository authorRepository;

  public AuthorController(AuthorRepository authorRepository) {
    super();
    this.authorRepository = authorRepository;
  }

  @RequestMapping("/authors")
  public String getAuthors(Model model) {
    // Adding all authors in the author repository to the model to return to the
    // user. This model will be available to use in our Thymeleaf template.
    model.addAttribute("authors", authorRepository.findAll());
    return "authors/list";
  }

}
