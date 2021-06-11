package br.com.testesproj2_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_desc_estados.*

class DescEstados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_estados)

        var desc_estado=intent.getStringExtra("descricao")
        val textoE=findViewById<TextView>(R.id.desricao_resultado)
        //desricao_resultado.text=desc_estado.toString()


        if (desc_estado.toString()=="Amazonas"){
            imagem_estado_1.setImageResource(R.drawable.ammercadomunicipaladolpholisboa)
            imagem_estado_2.setImageResource(R.drawable.ampraiadotupe)
            imagem_estado_3.setImageResource(R.drawable.ammuseudoseringal)
            imagem_estado_4.setImageResource(R.drawable.amteatroamazonas)
            desricao_resultado.text="Amazonas é um enorme estado no noroeste do Brasil, coberto quase na sua totalidade pela floresta tropical da Amazónia." +
                    " A capital, Manaus, é um porto fluvial com pontos de referência que datam do ciclo da borracha de finais do século XIX, incluindo o Teatro Amazonas," +
                    " uma grande casa de ópera. A cidade marca o \"Encontro das Águas\"," +
                    " onde o rio Negro, de água negra, e o rio Solimões se juntam para formar o rio Amazonas."

        }else if (desc_estado.toString()=="Amapá"){
            imagem_estado_1.setImageResource(R.drawable.apmarcozero)
            imagem_estado_2.setImageResource(R.drawable.apcasadoartesaoedoindio)
            imagem_estado_3.setImageResource(R.drawable.apfortalezasaojosedomacapa)
            imagem_estado_4.setImageResource(R.drawable.aptrapicheeliezerlevy)
            desricao_resultado.text="Amapá é um estado no norte do Brasil que faz fronteira com o Suriname, a Guiana Francesa" +
                    " e o Oceano Atlântico. A floresta amazónica abrange uma grande parte da sua área e o rio Oiapoque faz parte" +
                    " da sua fronteira a norte. No sul, a capital, Macapá, é conhecida pela Fortaleza de São José de Macapá, situada" +
                    " à beira-mar, um forte português do século XVIII, e pelo Monumento do Marco Zero, um obelisco que marca o equador."

        }else if (desc_estado.toString()=="Tocantins"){

            imagem_estado_1.setImageResource(R.drawable.tomemorialluiscarlosprestes)
            imagem_estado_2.setImageResource(R.drawable.tomuseuhistoricodotocantins)
            imagem_estado_3.setImageResource(R.drawable.toparqueestadualdocantao)
            imagem_estado_4.setImageResource(R.drawable.toparqueestadualdojalapao)
            desricao_resultado.text="Tocantins é um estado no centro do Brasil. Caracteriza-se pelo cerrado (prado seco e matagais)," +
                    " rios vastos e plantações de soja. A capital moderna, Palmas, foi construída propositadamente no centro geográfico" +
                    " do estado e está rodeada de colinas arborizadas. Ligeiramente a sudeste de Palmas, Taquaruçu do Porto é um destino de" +
                    " ecoturismo conhecido pelos trilhos de caminhada e pelas quedas de água"

        }else if (desc_estado.toString()=="Pará"){

            imagem_estado_1.setImageResource(R.drawable.pamercadoveropeso)
            imagem_estado_2.setImageResource(R.drawable.pamuseuparaenseemiliogoeldi)
            imagem_estado_3.setImageResource(R.drawable.paparqueecologicomangaldasgarcas)
            imagem_estado_4.setImageResource(R.drawable.patheatrodapaz)
            desricao_resultado.text="Pará, um estado no norte do Brasil, é onde se encontra o Parque Nacional da Amazônia. Protegendo" +
                    " uma extensa faixa da exuberante e densa Floresta Amazônica, o parque é lar de milhares de espécies da vida selvagem" +
                    ". Boa parte dela é alagada todos os anos, tornando o acesso a áreas distantes somente por barco. Próxima da desembocadura" +
                    " do Rio Amazonas está Belém, a capital do Pará. Ela é conhecida pela arquitetura colonial e pelo mercado Ver-o-Peso às margens" +
                    " do rio"

        }else if (desc_estado.toString()=="Roraima"){

            imagem_estado_1.setImageResource(R.drawable.rrcentrocivico)
            imagem_estado_2.setImageResource(R.drawable.rrharascunha)
            imagem_estado_3.setImageResource(R.drawable.rrmonumentogarimpeiro)
            imagem_estado_4.setImageResource(R.drawable.rrorlataumanan)
            desricao_resultado.text="Roraima, o estado mais a norte do Brasil, é conhecido pela Floresta Amazónica. A capital, Boa Vista," +
                    " na margem oeste de Rio Branco, fica próxima dos parques nacionais da Serra da Mocidade, a sudoeste, e do Monte Roraima" +
                    ", a norte. Com penhascos íngremes e um misterioso cume plano, o Monte Roraima, partilhado com a Venezuela e a Guiana, foi," +
                    " presumivelmente, a inspiração de Sir Arthur Conan Doyle para \"O Mundo Perdido\"."

        }else if (desc_estado.toString()=="Acre"){

            imagem_estado_1.setImageResource(R.drawable.acpalacioriobranco)
            imagem_estado_2.setImageResource(R.drawable.acparqueambientalchicomendes)
            imagem_estado_3.setImageResource(R.drawable.acparquedamaternidade)
            imagem_estado_4.setImageResource(R.drawable.acparquenacionaldaserradodivisor)
            desricao_resultado.text="Acre é um estado no noroeste do Brasil, na Floresta Amazónica. É conhecido pela quantidade de" +
                    " árvores-da-borracha e castanhas-do-brasil. Na fronteira peruana, a oeste, o Parque Nacional da Serra do Divisor" +
                    " possui montanhas elevadas e várias quedas de água, além de diversas espécies animais, como tatus-gigantes, tapires" +
                    " e aves raras. A sudeste, encontra-se Rio Branco, a capital do estado, nas margens do rio Acre"

        }else if (desc_estado.toString()=="Rondônia"){

            imagem_estado_1.setImageResource(R.drawable.roespacoalternativodeportovelho)
            imagem_estado_2.setImageResource(R.drawable.roferroviamadeiramamore)
            imagem_estado_3.setImageResource(R.drawable.romemorialomarechaldapaz)
            imagem_estado_4.setImageResource(R.drawable.romercadocultural)
            desricao_resultado.text="Rondônia é um estado na região oeste do Brasil, na fronteira boliviana, conhecida pelas vastas" +
                    " extensões de floresta amazónica. No centro, fica o montanhoso Parque Nacional de Pacaás Novos. A oeste, as áreas" +
                    " florestais adicionais estão protegidas pelo Parque Nacional da Serra da Cutia e o Parque Estadual Guajará-Mirim." +
                    " A norte, a capital do estado, Porto Velho, situa-se nas margens do rio Madeira."

        }else if (desc_estado.toString()=="Alagoas"){

            imagem_estado_1.setImageResource(R.drawable.almaragogi)
            imagem_estado_2.setImageResource(R.drawable.alportodepedras)
            imagem_estado_3.setImageResource(R.drawable.alpraiadapontaverde)
            imagem_estado_4.setImageResource(R.drawable.alpraiadecarroquebrado)
            desricao_resultado.text="Alagoas é um pequeno estado do nordeste brasileiro cujo litoral tropical é marcado por praias de " +
                    "areia branca repletas de palmeiras, lagoas cristalinas e recifes de corais. Em Maceió, sua capital, estão localizadas" +
                    " as famosas praias Pajuçara e Ponta Verde, com hotéis, bares e restaurantes. Os recifes de corais decoram o litoral ao" +
                    " norte de Maceió que, por isso, tem o apelido de Costa dos Corais."

        }else if (desc_estado.toString()=="Bahia"){

            imagem_estado_1.setImageResource(R.drawable.bacasadeculturajorgeamado)
            imagem_estado_2.setImageResource(R.drawable.baelevadorlacerda)
            imagem_estado_3.setImageResource(R.drawable.bamercadomodelo)
            imagem_estado_4.setImageResource(R.drawable.bapelourinho)
            desricao_resultado.text="A Bahia é um estado do nordeste brasileiro com paisagens que variam da costa tropical até a aridez do" +
                    " Sertão. A capital, Salvador, é conhecida por seu centro histórico, o Pelourinho, com uma rica arquitetura colonial do" +
                    " século XVII e assentado sobre a Baía de Todos-os-Santos. O Carnaval da cidade reúne foliões fantasiados que dançam ao som" +
                    " do samba e do axé em uma enorme festa de rua."

        }else if (desc_estado.toString()=="Ceará"){

            imagem_estado_1.setImageResource(R.drawable.cecanoaquebrada)
            imagem_estado_2.setImageResource(R.drawable.cechapadadoararipe)
            imagem_estado_3.setImageResource(R.drawable.celagoadajijoca)
            imagem_estado_4.setImageResource(R.drawable.cepedrafurada)
            desricao_resultado.text="O Ceará, um estado do nordeste brasileiro, tem um interior montanhoso e um litoral atlântico com" +
                    " impressionantes falésias vermelhas. O balneário de Canoa Quebrada tem enormes dunas de areia rosadas e a Rua Dragão" +
                    " do Mar, muito movimentada e também conhecida como Broadway. A cidade isolada de Jericoacoara, cercada pelo Parque Nacional" +
                    " de Jericoacoara, repleto de dunas, é famosa por suas ruas de areia, pela prática de windsurfe e pelo pôr do sol incomum em" +
                    " tons de verde"

        }else if (desc_estado.toString()=="Maranhão"){

            imagem_estado_1.setImageResource(R.drawable.macasadonhozinho)
            imagem_estado_2.setImageResource(R.drawable.macentrohistoricosaoluisruaportugal)
            imagem_estado_3.setImageResource(R.drawable.machapadadasmesas)
            imagem_estado_4.setImageResource(R.drawable.malencoismaranhenses)
            desricao_resultado.text="Maranhão, estado no nordeste brasileiro, é formado em parte pela Floresta Amazônica e pelas praias" +
                    " ao longo do Oceano Atlântico. Próximo à cidade de Barreirinhas, grandes dunas de areia branca criam paisagens que lembram" +
                    " um deserto no Parque Nacional Lençóis Maranhenses, onde lagoas de água fresca nas quais se pode nadar se formam durante a" +
                    " temporada de chuvas. É na capital, São Luís, que se encontra o agitado bairro histórico conhecido como Reviver."

        }else if (desc_estado.toString()=="Paraíba"){

            imagem_estado_1.setImageResource(R.drawable.pbcentrohistoricojoaopessoa)
            imagem_estado_2.setImageResource(R.drawable.pblajedodopaimateus)
            imagem_estado_3.setImageResource(R.drawable.pbpiscinasnaturaispicaozinho)
            imagem_estado_4.setImageResource(R.drawable.pbpraiadojacare)
            desricao_resultado.text="Paraíba, um estado no nordeste do Brasil, é conhecido pela linha da costa tropical e pela arquitetura" +
                    " colonial portuguesa. A capital, João Pessoa, possui praias como a Manaíra e Tambaú, além de locais de mergulho repletos" +
                    " de corais ao largo da costa. Junto ao rio Paraíba, o centro histórico da cidade possui casas coloridas e a igreja de São" +
                    " Francisco, com uma arquitetura barroca. A Ponta do Seixas, com o farol Cabo Branco nas proximidades, marca o ponto mais a" +
                    " leste das Américas"

        }else if (desc_estado.toString()=="Pernambuco"){

            imagem_estado_1.setImageResource(R.drawable.peembaixadadosbonecosgigantes)
            imagem_estado_2.setImageResource(R.drawable.pepraiadoscarneirosecapelasaobenedito)
            imagem_estado_3.setImageResource(R.drawable.perecifeantigo)
            imagem_estado_4.setImageResource(R.drawable.petorremalakoff)
            desricao_resultado.text="Pernambuco é um estado no nordeste do Brasil, no Oceano Atlântico. A sua capital moderna, o Recife, inclui" +
                    " um porto, a cidade velha e a popular área balnear de Boa Viagem. Ao largo da costa, o arquipélago vulcânico de Fernando de" +
                    " Noronha possui uma linha costeira dentada, praias poucos urbanizadas e um parque marítimo. A sul do Recife, a praia de Porto" +
                    " de Galinhas, protegida por um recife, oferece piscinas naturais. A norte encontra-se Olinda, uma cidade colonial situada entre" +
                    " uma vegetação exuberante."

        }else if (desc_estado.toString()=="Piauí"){

            imagem_estado_1.setImageResource(R.drawable.pideltadoparnaiba)
            imagem_estado_2.setImageResource(R.drawable.piparquenacionalserradacapivarai)
            imagem_estado_3.setImageResource(R.drawable.pipoloceramicodopotyvelho)
            imagem_estado_4.setImageResource(R.drawable.pipraiadocoqueiro)
            desricao_resultado.text="Piauí é um estado no nordeste do Brasil conhecido pelos parques nacionais. O Parque Nacional Serra da Capivara," +
                    " no sudeste, possui sítios arqueológicos com pinturas rupestres pré-históricas. Nas proximidades, o Parque Nacional Serra das" +
                    " Confusões tem gigantescas formações rochosas e grandes áreas de caatinga (vegetação semiárida), onde vivem aves em risco de" +
                    " extinção. As mangueiras ladeiam as ruas da capital à beira-rio, Teresina."

        }else if (desc_estado.toString()=="Rio Grande do Norte"){

            imagem_estado_1.setImageResource(R.drawable.rndunasdegenipabu)
            imagem_estado_2.setImageResource(R.drawable.rnparrachosdemaracajau)
            imagem_estado_3.setImageResource(R.drawable.rnpraiadepipa)
            imagem_estado_4.setImageResource(R.drawable.rnpraiadepontanegra)
            desricao_resultado.text="Rio Grande do Norte é um estado na extremidade nordeste do Brasil. A capital, Natal, fica numa costa" +
                    " repleta de praias onde se encontra o Forte dos Reis Magos, em forma de estrela, um forte português do século XVI. " +
                    "Ponta Negra é uma praia enquadrada pela enorme duna, Morro do Careca, um símbolo da cidade. A sul, a Praia de Pipa é uma" +
                    " estância célebre pelo surf e pelos golfinhos."

        }else if (desc_estado.toString()=="Sergipe"){

            imagem_estado_1.setImageResource(R.drawable.secroagoreeriovazabarris)
            imagem_estado_2.setImageResource(R.drawable.semercadomunicipalthalesferraz)
            imagem_estado_3.setImageResource(R.drawable.seorladeatalaia)
            imagem_estado_4.setImageResource(R.drawable.sepraiadosaco)
            desricao_resultado.text="Sergipe, o estado mais pequeno do Brasil, situa-se na costa atlântica da região do nordeste. " +
                    "A capital, Aracaju, é conhecida pelas praias, tal como a Praia da Atalaia, com o seu longo passeio. Fundada em 1590," +
                    " a antiga capital, São Cristóvão, alberga edifícios da era colonial, incluindo o convento e a Igreja de São Francisco," +
                    " do século XVII. O Cânion do Xingó, no rio de São Francisco, ladeia um popular lago para passeios de barco."

        }else if (desc_estado.toString()=="Goiás"){

            imagem_estado_1.setImageResource(R.drawable.gocachoeiradacapivara)
            imagem_estado_2.setImageResource(R.drawable.gocaldasnovas)
            imagem_estado_3.setImageResource(R.drawable.goparauna)
            imagem_estado_4.setImageResource(R.drawable.gorioaraguaia)
            desricao_resultado.text="Goiás, um estado no centro do Brasil, alberga a savana acidentada, cidades da era colonial e uma" +
                    " agricultura de grande escala. O Parque Nacional da Chapada dos Veadeiros é uma reserva de montanhas paisagísticas" +
                    " com trilhos, rios, desfiladeiros e quedas de água. Fundadas durante o século XVIII, as cidades do ciclo de ouro de" +
                    " Pirenópolis e Goiás Velho (antiga capital do estado) distinguem-se pela arquitetura colonial portuguesa e pelas vibrantes" +
                    " festas cristãs."

        }else if (desc_estado.toString()==" Mato Grosso"){

            imagem_estado_1.setImageResource(R.drawable.mtbomjardimnobres)
            imagem_estado_2.setImageResource(R.drawable.mtchapadadosguimaraes)
            imagem_estado_3.setImageResource(R.drawable.mtchapadadosguimaraes)
            imagem_estado_4.setImageResource(R.drawable.mtvaledoaraguaia)
            desricao_resultado.text="Mato Grosso, um grande estado no centro-oeste brasileiro, é coberto na maioria pela floresta" +
                    " tropical amazónica, as zonas húmidas e as planícies da savana. A capital, Cuiabá, é um centro de viagens que" +
                    " remonta à corrida ao ouro do século XVIII. Nas proximidades, o Parque Nacional da Chapada dos Guimarães possui" +
                    " áreas de caminhada com penhascos em arenito, quedas de água e cavernas. As extensas zonas húmidas do Pantanal" +
                    " albergam diversas espécies selvagens, incluindo araras, caimões e jaguares"

        }else if (desc_estado.toString()=="Mato Grosso do Sul"){

            imagem_estado_1.setImageResource(R.drawable.msbonito)
            imagem_estado_2.setImageResource(R.drawable.msfeiracentral)
            imagem_estado_3.setImageResource(R.drawable.msparquedasnacoesindigenas)
            imagem_estado_4.setImageResource(R.drawable.msparquedosipes)
            desricao_resultado.text="Mato Grosso do Sul é uma das 27 unidades federativas do Brasil. Localiza-se no sul da Região" +
                    " Centro-Oeste. Limita-se com cinco estados brasileiros: Mato Grosso, Goiás e Minas Gerais, São Paulo e Paraná;" +
                    " e dois países sul-americanos: Paraguai e Bolívia."

        }else if (desc_estado.toString()=="Distrito Federal"){

            imagem_estado_1.setImageResource(R.drawable.dfcatedral)
            imagem_estado_2.setImageResource(R.drawable.dfmemorialjk)
            imagem_estado_3.setImageResource(R.drawable.dfpontejk)
            imagem_estado_4.setImageResource(R.drawable.dfpracadostrespoderes)
            desricao_resultado.text="O Distrito Federal situa-se nas montanhas centrais do Brasil e alberga a capital da nação," +
                    " Brasília, cidade moderna e planeada para o efeito. A cidade tem edifícios futuristas concebidos pelo célebre " +
                    "arquiteto brasileiro, Oscar Niemeyer. Estes incluem a Catedral de Brasília, que é curva e tem telhados de vidro." +
                    " O Palácio Itamaraty de Niemeyer é conhecido pelos arcos, o espelho de água e os jardins tropicais."

        }else if (desc_estado.toString()=="São Paulo"){

            imagem_estado_1.setImageResource(R.drawable.spavenidapaulista)
            imagem_estado_2.setImageResource(R.drawable.spcatedralse)
            imagem_estado_3.setImageResource(R.drawable.spmuseudeartesaopauloassis)
            imagem_estado_4.setImageResource(R.drawable.spparquedoibirapuera)
            desricao_resultado.text="São Paulo, centro financeiro do Brasil, está entre as cidades mais populosas do mundo, com " +
                    "diversas instituições culturais e uma rica tradição arquitetônica. Há prédios simbólicos como a catedral neogótica" +
                    ", o Edifício Martinelli, um arranha-céu inaugurado em 1929, e o Edifício Copan, com suas linhas curvas projetadas " +
                    "pelo arquiteto modernista Oscar Niemeyer. A igreja em estilo colonial do Pátio do Colégio marca o local onde os padres" +
                    " jesuítas fundaram a cidade em 1554."

        }else if (desc_estado.toString()=="Rio de Janeiro"){

            imagem_estado_1.setImageResource(R.drawable.rjconfeitariacolombo)
            imagem_estado_2.setImageResource(R.drawable.rjjardimbotanico)
            imagem_estado_3.setImageResource(R.drawable.rjpaodeacucar)
            imagem_estado_4.setImageResource(R.drawable.rjpraiadecopacana)
            desricao_resultado.text="O Rio de Janeiro é uma grande cidade brasileira à beira-mar, famosa pelas praias de" +
                    " Copacabana e Ipanema, pela estátua de 38 metros de altura do Cristo Redentor, no topo do Corcovado, e" +
                    " pelo Pão de Açúcar, um pico de granito com teleféricos até seu cume. A cidade também é conhecida pelas grandes" +
                    " favelas. O empolgante Carnaval, com carros alegóricos, fantasias extravagantes e sambistas, é considerado o maior do mundo."

        }else if (desc_estado.toString()=="Minas Gerais"){

            imagem_estado_1.setImageResource(R.drawable.mgbasilicanossasenhoradopilar)
            imagem_estado_2.setImageResource(R.drawable.mgigrejasaofranciscodeassispampulha)
            imagem_estado_3.setImageResource(R.drawable.mgmonteverde)
            imagem_estado_4.setImageResource(R.drawable.mgmonteverde)
            desricao_resultado.text="Minas Gerais, um grande estado continental no sudeste do Brasil, é conhecido por cidades" +
                    " da era colonial que remetem à corrida do ouro no país no século 18. Entre elas estão São João del Rei, Tiradentes" +
                    " e Ouro Preto, a antiga capital, todas com ruas de paralelepípedo, mansões ornamentadas e igrejas barrocas decoradas" +
                    " pelo escultor Aleijadinho.O famoso trem a vapor Maria Fumaça liga Tiradentes a São João del Rei."

        }else if (desc_estado.toString()=="Espírito Santo"){

            imagem_estado_1.setImageResource(R.drawable.esconventodapenha)
            imagem_estado_2.setImageResource(R.drawable.esparqueestadualdeitaunas)
            imagem_estado_3.setImageResource(R.drawable.espedraazul)
            imagem_estado_4.setImageResource(R.drawable.espraiadaareiapreta)
            desricao_resultado.text="O Espírito Santo, estado da região Sudeste do Brasil, é conhecido por suas praias tropicais e áreas" +
                    " naturais montanhosas preservadas. Fundada em 1551, Vitória, capital e cidade portuária, tem um pequeno centro da era" +
                    " colonial. Do outro lado da estreita baía de Vitória, fica Vila Velha, com a movimentada Praia da Costa e o Convento da" +
                    " Penha, construção do século XVI que fica no alto de um penhasco e oferece uma vista panorâmica"

        }else if (desc_estado.toString()=="Paraná"){

            imagem_estado_1.setImageResource(R.drawable.prcataratasdoiguacu)
            imagem_estado_2.setImageResource(R.drawable.prjardimbotanicodecuritiba)
            imagem_estado_3.setImageResource(R.drawable.prmuseuoscarniemeyer)
            imagem_estado_4.setImageResource(R.drawable.prparquedasaves)
            desricao_resultado.text="Paraná é um estado no sul do Brasil que alberga as Cataratas do Iguaçu, com centenas de cascatas que" +
                    " se estendem ao longo da fronteira com a Argentina. Em torno das cataratas encontra-se o Parque Nacional do Iguaçu, uma" +
                    " floresta subtropical com diversas espécies selvagens, enquanto no norte se encontra a enorme barragem de Itaipu. Centenas" +
                    " de quilómetros a este, perto das praias atlânticas de Guaratuba e do grande porto de Paranaguá, fica a frondosa capital do" +
                    " estado, Curitiba"

        }else if (desc_estado.toString()=="Santa Catarina"){

            imagem_estado_1.setImageResource(R.drawable.scbetocarreroworld)
            imagem_estado_2.setImageResource(R.drawable.scdunasdosiriu)
            imagem_estado_3.setImageResource(R.drawable.scpedradourubu)
            imagem_estado_4.setImageResource(R.drawable.sczoopomerode)
            desricao_resultado.text="Santa Catarina é um estado na região sul do Brasil. Com uma longa costa com o Atlântico e muitas ilhas," +
                    " ela é conhecida por suas praias e montanhas. Florianópolis, a capital, tem um mercado público tradicional com bares," +
                    " restaurantes e barracas de comida, além de um museu histórico instalado em um palácio do governo colonial do século 19." +
                    " Florianópolis está basicamente na ilha de Santa Catarina, que conta com resorts de praia na extremidade norte."

        }else if (desc_estado.toString()=="Rio Grande do Sul"){

            imagem_estado_1.setImageResource(R.drawable.rscanionitaimbezinho)
            imagem_estado_2.setImageResource(R.drawable.rslagonegro)
            imagem_estado_3.setImageResource(R.drawable.rsparquedaguarita)
            imagem_estado_4.setImageResource(R.drawable.rsruinasjesuiticas)
            desricao_resultado.text="Rio Grande do Sul é o estado mais a sul do Brasil e faz fronteira com a Argentina e o Uruguai." +
                    " A nordeste, a montanhosa Serra Gaúcha alberga a região vinícola do Vale dos Vinhedos e inclui cidades turísticas" +
                    " de estilo alemão como Gramado e Canela, famosas pelas paisagens naturais pitorescas. Porto Alegre, a capital, é um" +
                    " grande porto com estruturas clássicas como o Mercado Público e a Catedral Metropolitana, no centro histórico."
        }
    }
}