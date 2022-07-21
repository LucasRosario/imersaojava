package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

  private List<Linguagem> linguagens = List.of(
      new Linguagem("Java",
          "https://camo.githubusercontent.com/1630f8163d36c12ba82e9cb502886d0951351aab4c18ac7a042ef871cb05f6ac/68747470733a2f2f63646e2e6a7364656c6976722e6e65742f6e706d2f4070726f6772616d6d696e672d6c616e6775616765732d6c6f676f732f6a61766140302e302e302f6a6176615f323536783235362e706e67",
          1),
      new Linguagem("Php",
          "https://camo.githubusercontent.com/0bfae1cd94ba02e04e473181296d77a62fcba7df0b8ee281a660c75825868676/68747470733a2f2f63646e2e6a7364656c6976722e6e65742f6e706d2f4070726f6772616d6d696e672d6c616e6775616765732d6c6f676f732f70687040302e302e302f7068705f323536783235362e706e67",
          2));

  @GetMapping("/linguagens")
  public List<Linguagem> obterLinguagens() {
    return linguagens;
  }

}
