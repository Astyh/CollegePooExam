# CollegePooExam

Prova de Programação Orientada a Objeto - Diurno


Um curso de informática precisa de um sistema para cadastrar seus alunos. Cada turma de alunos pode ter no máximo 20 alunos. Crie uma classe para as turmas e outra para os alunos. A classe das turmas precisa ter como atributos o nome do curso, a quantidade total de aulas e a lista de alunos. A classe para os alunos precisa registrar código do aluno (valor inteiro), seu nome, a nota final e a quantidade de faltas.

void incluirAluno(Aluno al)
Inclui um aluno na lista de alunos. Note que o máximo permitido em cada turma é 20 alunos. Se ocorrer uma tentativa de incluir mais do que 20 alunos o método deve lançar uma exceção e não incluir o aluno. O mesmo acontece quando o código do aluno já existe na lista. A lista não pode conter dois alunos com o mesmo código. Quando um aluno é incluído, a nota final e a quantidade de faltas ficam zeradas. Estes atributos serão atualizados por outros métodos.

Aluno buscarAluno(int codigo)
Recebe o código do aluno via parâmetro e retorna uma referencia para o Aluno com o código informado. Se não encontrar o código do aluno na lista, o método deve retornar o valor null.

void registrarFalta(int codigo);
Adiciona uma falta na quantidade de faltas do aluno com o código indicado pelo parâmetro do método. Se o código não existe, deve lançar uma exceção informando o erro. 

void atribuirNota(int codigo, double nota)
Atribui uma nota para o aluno com o código indicado pelo parâmetro. A nota só pode ser um valor entre 1 e 10 (inclusive). Se o código não existe, ou se o valor da nota não está na faixa válida o método deve lançar uma exceção.

void listarAlunos()
Lista todos os alunos na saída padrão. A listagem deve incluir o código, o nome, a nota final, quantidade de faltas e a frequência (porcentagem de presenças em relação ao total de aulas) de cada aluno. No topo da listagem imprima os dados da turma.

void listarAprovados()
Lista todos os alunos aprovados na saída padrão. O aluno é considerado aprovado se sua nota for maior ou igual a 6 e se sua frequência for maior ou igual a 75%. A listagem deve incluir os mesmos campos que a listagem acima. No topo da listagem imprima os dados da turma.

Importante:
1.	Teste os métodos implementados e capture todas as exceções no método main. 
2.	Não utilize as classes List<>, ArrayList<> ou qualquer classe de manipulação de listas já pronta do java.
