package br.edu.caua.projetotransportadora.trasportadora;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import br.edu.caua.projetotransportadora.trasportadora.dao.MultaDao;
import br.edu.caua.projetotransportadora.trasportadora.dao.ParceirosDao;
import br.edu.caua.projetotransportadora.trasportadora.entidades.Multa;
import br.edu.caua.projetotransportadora.trasportadora.entidades.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerTelaMulta implements Initializable {

    @FXML
    private TableColumn<Multa, Float> tableColumnValor;

    @FXML
    private TableColumn<Veiculo, Integer> tableColumnVeiculoId;

    @FXML
    private DatePicker datePickerNascimento;

    @FXML
    private TextField textFieldNome;

    @FXML
    private Button buttonNovo;

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldNome1;

    @FXML
    private TableView<Multa> tableViewMulta;

    @FXML
    private TextField textFieldNome2;

    @FXML
    private TableColumn<Multa, Integer> tableColumnId;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private TableView<Veiculo> tableViewVeiculo;

    @FXML
    private TableColumn<Multa, Date> tableColumnData;

    @FXML
    private TableColumn<Multa, String> tableColumnLocal;

	private MultaDao multaDao;

    @FXML
    void handlerSalvar(ActionEvent event) {

    }

    @FXML
    void handlerExcluirCliente(ActionEvent event) {

    }

    @FXML
    void handlerNovoCliente(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		  multaDao = new MultaDao(); popularTabelaMulta();
		  tableViewMulta.getSelectionModel().selectedItemProperty()
		  .addListener((observable, oldValue, newValue)->selecionarMulta(newValue));		
	}

	private Object selecionarMulta(Object newValue) {
		// TODO Auto-generated method stub
		return null;
	}

	private void popularTabelaMulta() {
		// TODO Auto-generated method stub
		
	}

}

