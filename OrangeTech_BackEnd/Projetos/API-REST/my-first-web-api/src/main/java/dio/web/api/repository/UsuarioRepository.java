package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
     public void save(Usuario usuario){
         if (usuario.getLogin()==null)
             throw new CampoObrigatorioException("Login");
         if (usuario.getPassword()==null)
             throw new CampoObrigatorioException("Password");

         if (usuario.getId() == null) {
             System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
         }else
             System.out.println("UPDATE - Recebendo o usuario da camada de repositorio");
         System.out.println(usuario);
     }
     public void deleteById(Integer id){
         System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuario ",id,"\n");
//         System.out.println(id);
     }
     public List<Usuario> findAll(){
         System.out.println("LIST - Listando os usuarios do sistema");
         List<Usuario> usuarios = new ArrayList<>();
         usuarios.add(new Usuario("Angelo","password"));
         usuarios.add(new Usuario("SIG","masterpass"));
         return usuarios;
     }
     public Usuario findById(Integer id){
         System.out.printf("FIND/username - Recebendo o id: %d para localizar um usuario%n",id,"\n");
         return new Usuario("Angelo","password");
     }
     public Usuario findByUsername(String username){
         System.out.printf("FIND/username - Recebendo o username: %s para%n",username,"\n");
         return new Usuario("Angelo","password");
     }
}
