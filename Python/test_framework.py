class CasoDeTeste:
	def __init__(self, nome):
		self.nome = nome

	def executa(self):
		metodo = getattr(self, self.nome)
		metodo()


class FoiTestado(CasoDeTeste):
	def __init__(self, nome):
		self.foiTestado = None
		CasoDeTeste.__init__(self, nome)
		
	def metodoDeTeste(self):
		self.foiTestado = 1


class TesteDoCasoDeTeste(CasoDeTeste):
	def testeExecutando(self):
		teste = FoiTestado("metodoDeTeste")
		assert(not teste.foiTestado)
		teste.executa()
		assert(teste.foiTestado)

TesteDoCasoDeTeste("testeExecutando").executa()