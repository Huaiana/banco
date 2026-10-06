
import com.git.banco.Service.ClienteService;
import com.git.banco.model.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente cadastrar(@RequestParam String nome,
                            @RequestParam String tipo, // "PF" ou "PJ"
                            @RequestParam String documento,
                            @RequestParam(required = false) String email) {
        return clienteService.cadastrar(nome, tipo, documento, email);
    }
}       s