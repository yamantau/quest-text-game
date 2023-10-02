package ru.javarush.bilalov.quest;

import ru.javarush.bilalov.quest.entity.Variant;
import ru.javarush.bilalov.quest.repository.LifeQuestRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //запустить, если надо что то добавить / убрать
        LifeQuestRepository lifeQuestRepository = new LifeQuestRepository();

        lifeQuestRepository.createNewAnswer(100, "Конец истории", "Вы умерли",
                List.of(
                        new Variant(1, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(1, "Предыстория", "Сквозь пустоту бесконечности сияющий огонь души просочился в неизвестные просторы. В то далекое время, когда создание и разрушение были лишь неразделимой частью космического танца, происходило зарождение новой вселенной.\n" +
                        "Из сжавшегося семени божественной сущности вырвалась вспышка энергии, пронизывая тьму сияющим светом. Огонь, который стал источником жизни и магии, заполнил пространство, формируя звезды, планеты и небесные тела. Мощные потоки магической энергии проходили сквозь каждый из этих миров, придавая им свою уникальность.\n" +
                        "\n" +
                        "В это время великие круги судьбы начали расплетаться, причудливо переплетаясь между собой. Были избраны четыре великих мага, каждый из которых олицетворял силу одного из стихийных элементов - земли, воды, воздуха и огня. Их мудрость и сила стали непременным фактором в существовании этой новой вселенной.\n" +
                        "\n" +
                        "Однако, великое пророчество гласило о приходе избранных среди смертных, которые смогут превзойти даже самых могущественных магов. Их истинная природа ещё скрывалась в пелене времени, но с каждым дыханием космоса их сила становилась все явственнее.\n" +
                        "\n" +
                        "И вот, в маленьком уголке этой грандиозной вселенной, в неважной земной деревне, родился герой нашей истории. Его душа, пропитанная магическим светом, обладала неизведанной силой, способной изменить ход событий в этом мире.\n" +
                        "\n" +
                        "Ты вступаешь на путь выбора, моё дорогое существо, и преследуешь собственную судьбу. Что же ждёт тебя впереди? Ответы на твои вопросы лежат во вселенной магии и тайн, ожидая, чтобы быть открытыми. Приготовься, великий путник, к битве за будущее всей вселенной магов.",
                List.of(
                        new Variant(2, "Поехали!")
                ));
        lifeQuestRepository.createNewAnswer(2, "Взросление", "В мире магии и тайн наш герой, обладая неизведанной силой своей души, стоит перед двумя вариантами выбора, которые определят его судьбу и будущее всей вселенной? \n\n" +
                        "Таким образом, наш герой стоит перед выбором между светом и тенью, добром и злом. Какое решение он примет, определит его судьбу и повлияет на дальнейшие события в этой магической вселенной. Ответы и приключения ждут его по обоим путям, и именно он, воплощение силы и магии, будет формировать будущее в этой великой саге.",
                List.of(
                        new Variant(3, "Путь Света"),
                        new Variant(4, "Путь Тени")
                ));
        lifeQuestRepository.createNewAnswer(3, "Путь Света", "Благородный герой принял решение пойти по пути света, стремясь к добру и справедливости. С его доблестью и надеждой на сердце, он начал свое путешествие по миру.\n" +
                        "\n" +
                        "Во время своего приключения герой стал сторонником защиты беспомощных и борцом со злом. Он помогал нуждающимся и сражался с теми, кто угрожал мирным обитателям. Через свои подвиги он стал известным как великий",
                List.of(
                        new Variant(7, "Великий защитник"),
                        new Variant(8, "Мудрый наставник")
                ));

        lifeQuestRepository.createNewAnswer(7, "Защитник, заботящийся о мире", "Герой стал главой ордена рыцарей, объединившего множество благородных душ, стремящихся к свету. Вместе они охраняли мир и сражались с тьмой. Орден рыцарей стал символом надежды и мощи, заставив зло уклоняться перед их присутствием. Герой возглавил ряд успешных кампаний и победил множество противников, обеспечивая мир и благополучие всему миру. Его имя и дела запечатленные в легендах, будут вдохновлять будущих поколений. " +
                        "Спустя много лет службы ордену рыцарей, герой стал сталкиваться с растущими угрозами, которые даже его мощные рыцари не могли одолеть. Все больше людей требовали, чтобы он использовал запретные и опасные силы, чтобы победить врагов. Герой ощущал великое искушение пойти на этот путь, но глубоко в своем сердце он знал, что это будет означать отступление от своих принципов и приведет к погружению во тьму.",
                List.of(
                        new Variant(9, "Пойти путем компромисса"),
                        new Variant(10, "Остаться на пути света")
                ));

        lifeQuestRepository.createNewAnswer(9, "Финал", "Герой, решив пойти путем компромисса, начинает использовать запретные силы для борьбы со своими врагами. Начальный успех подталкивает его все глубже во тьму, и он становится все более жестоким и неумолимым.\n" +
                        "\n" +
                        "Однако, по мере того, как герой погружается во тьму, сила запретных заклинаний начинает оказывать разрушительное воздействие не только на его врагов, но и на самого героя. Он теряет человечность и сочувствие, превращаясь в беспощадного и опасного мага. Его прежние союзники и друзья отвергают его, потому что видят, как он превращается во врага, к которому он так долго боролся.\n" +
                        "\n" +
                        "Сочувствие и поддержка героя исчезают, и он остается один, окруженный разрушением и горестью. Его враги теперь объединены против него, пользуясь его слабостью и жестокостью. В результате, герой погибает в одиночной схватке, окончательно понимая, что его путь компромисса привел лишь к собственной гибели и разрушению мира, которым он хотел защищать.\n" +
                        "\n" +
                        "Таким образом, его судьба служит уроком для будущих поколений о том, что путь компромисса с тьмой неизбежно ведет к падению и погрязанию во зле.",
                List.of(
                        new Variant(100, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(10, "Финал", "Вам удалось собрать все необходимые артефакты и преодолеть множество испытаний, чтобы достичь своей цели – спасти магическую вселенную от уничтожения. Вы поднимаетесь на вершину могущественной горы, где находится древний алтарь, способный запустить ритуал, который восстановит баланс между светом и тьмой.\n" +
                        "\n" +
                        "Однако, как только вы ступаете на алтарь, появляется загадочный незнакомец, который представляется олицетворением самой тьмы. Он утверждает, что путь света, которым вы собирались идти, служит только его интересам, и он намерен использовать силу алтаря для захвата контроля над вселенной.\n" +
                        "\n" +
                        "Начинается схватка между вами и темным незнакомцем, и вы сталкиваетесь с его могущественной магией. Однако, вы мобилизуете все свои навыки, полученные в ходе своего пути, и встаете на защиту вселенной. После изнурительной битвы вы сумеваете преодолеть его зловещую силу и побеждаете.\n" +
                        "\n" +
                        "Свершается ритуал восстановления баланса, и свет начинает распространяться по всей магической вселенной, прогоняя тьму и восстанавливая хаос. Вас объявляют героем, спасшим мир от уничтожения, и все жители магической вселенной восхищаются вашим подвигом.",
                List.of(
                        new Variant(100, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(8, "Мудрый наставник", "Таким образом, герой, осознавая свою мудрость и знание, продолжил свой путь в роли мудрого наставника. Пока он наставлял молодых магов, мир стал все более и более погружаться во мрак тьмы, а зло начало гнездиться в самых неожиданных местах.\n" +
                        "\n" +
                        "Перед героем встал сложный выбор: остаться в роли наставника и продолжать свое дело, чтобы подготовить новое поколение магов к борьбе со злом, или снова стать воином, чтобы сразиться с тьмой непосредственно и вернуть миру свет и надежду.\n",
                List.of(
                        new Variant(11, "Остаться наставником"),
                        new Variant(12, "Сразиться со злом")
                ));

        lifeQuestRepository.createNewAnswer(11, "Финал", "Когда ты выбрал путь остаться наставником, твои ученики смотрят на тебя с восхищением и надеждой. Твои знания и опыт позволяют тебе научить их всему, что ты знаешь о магической вселенной.\n" +
                        "\n" +
                        "С годами ты становишься известным и уважаемым наставником. Твои ученики достигают высоких результатов и становятся мощными магами. Твое имя перекликается по всей вселенной, и многие желают стать твоими учениками.\n" +
                        "\n" +
                        "Ты проводишь свою жизнь, посвященную обучению и воспитанию нового поколения магов. Твое влияние распространяется далеко за пределы твоей академии, и многие благодарны тебе за твою мудрость и руководство.\n" +
                        "\n" +
                        "Твои ученики процветают, их знания и сила растут с каждым днем. Они становятся героями, защитниками и исследователями магической вселенной. И ты с гордостью видишь, как они продолжают традиции и наследие, которое ты начал.\n" +
                        "\n" +
                        "Ты живешь долгую и успешную жизнь, окруженный уважением и благодарностью своих учеников. Твоя сила и мудрость становятся легендой, и ты становишься одним из самых великих наставников, о которых шепчут на просторах магической вселенной. А ученики справляются с любым злом, которое появляется",
                List.of(
                        new Variant(100, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(12, "Финал", "Ты снова вступаешь в бой, готовый сразиться со своими врагами. Мощные заклинания пронизывают воздух, а твои противники в ужасе отступают. Ты проявляешь невероятный мастерство и с невероятной силой разрушаешь все преграды на своем пути.\n" +
                        "\n" +
                        "По мере того, как ты продвигаешься вперед, ты встречаешь союзников, которые верят в твои способности и готовы поддержать тебя. Вместе вы образуете непобедимую команду, которая справляется со всеми испытаниями, бросаемыми вам врагами.\n" +
                        "\n" +
                        "В конечном итоге, ваша команда достигает арены, где вас ожидает главный враг — могущественный темный маг. Битва достигает своего пика, столкновение между светом и тьмой захватывает весь воздух вокруг.\n" +
                        "\n" +
                        "Твои заклинания и умения перевешивают магическую мощь темного мага. Ты наносишь последний удар и побеждаешь своего врага, проливая свет в магическую вселенную.\n" +
                        "\n" +
                        "Победа приводит к восстановлению баланса сил в магической вселенной. Люди и существа получают новую надежду и возможность строить лучшее будущее. Ты становишься героем, прославленным во всей вселенной, и твое имя становится легендарным.\n" +
                        "\n" +
                        "Ты чувствуешь глубокое удовлетворение и исполнение своей миссии. Твои усилия привели к преображению магической вселенной, и ты знаешь, что твоя сила и воля улучшить этот мир непоколебимы.\n" +
                        "\n" +
                        "И так, заканчивается твое путешествие по магической вселенной. Ты получил бесценный опыт, силу и мудрость, которые будут сопровождать тебя на всей твоей дальнейшей жизненной пути.",
                List.of(
                        new Variant(100, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(4, "Путь Тени", "Привлекаемый таинственными силами Тени, герой выбирает дорогу, отличную от пути Света. Он осознает, что его магическая сущность имеет потенциал, который можно использовать для достижения собственных целей. Он погружается в мир интриг и тайн, становясь влиятельным членом тайного общества магов. Вместе со своими союзниками темной стороны магии, герой планирует захватить власть и контроль над вселенной. В битвах и загадках, он обнаруживает, что сила его души может покорить все, когда он обратится к стихийной энергии Тьмы.",
                List.of(
                        new Variant(5, "Покорение"),
                        new Variant(6, "Баланс")
                ));

        lifeQuestRepository.createNewAnswer(5, "Финал", "По мере того, как герой преследует свою жажду власти и увеличивает свои силы, силы света осознают угрозу, которую он представляет для вселенной. В ответ на это они создают подпольную организацию из самых могущественных светлых магов, чтобы остановить его.\n" +
                        "\n" +
                        "Наступает финальная битва между героем Пути Тени и альянсом светлых магов. Оба лагеря собирают вокруг себя свои армии, сражаясь с неожиданным и яростным противником. Магические вспышки и разрушение заполняют небо, пронзительные вопли и крики насыщают воздух.\n" +
                        "\n" +
                        "Битва достигает своего пика, когда силы Тени и света сходятся в эпическом противостоянии. Молнии и огненные шары летят во все стороны, пытаясь прорваться сквозь зловещие круги и защитные барьеры врага. Герой Пути Тени использует свои самые мощные заклинания и стратегическую тактику, чтобы уничтожить каждого светлого мага, стоящего на пути его власти.\n" +
                        "\n" +
                        "Но, к несчастью, битва выходит из-под контроля обеих сторон. Магические разрушения превосходят все ожидания, вызывая искажения в самой структуре реальности. Светлая и Темная стихии вспышивают и сражаются друг с другом, вызывая цепную реакцию, которая разрушает все существа и все, что находится во вселенной.\n" +
                        "\n" +
                        "В результате финальной битвы все существа и миры погибают, и одинокий герой остается на руинах того, что когда-то было живым и прекрасным. Он в конечном итоге побеждает, но становится правителем разрушенной пустыни, лишенной какой-либо жизни.\n" +
                        "\n" +
                        "Вот так оборачивается история о герое, выбравшем Путь Тени и преследующем покорение и власть. Его жажда могущества приводит к уничтожению всего, что было драгоценным и живым, оставляя его позади в мире безнадежности и пустоты. Это конец его истории, но также и конец вселенной, погрязшей в амбициях одного мага.",
                List.of(
                        new Variant(100, "Начать заново")
                ));

        lifeQuestRepository.createNewAnswer(6, "Финал", "Выбрав путь Баланса, герой осознал, что важно сохранить равновесие между светлой и темной магией не только на личном уровне, но и во всей вселенной. Решив, что конфронтация не является наилучшим решением, герой вознамерился построить мост между двумя противоборствующими силами.\n" +
                        "\n" +
                        "Сначала, герой отправился в путешествие по вселенной, разыскивая мудрых и искренних магов, которые готовы были поддержать его идею объединения. Он нашел множество людей из разных миров, которые разделяли его стремление к гармонии.\n" +
                        "\n" +
                        "Совет Магии был создан как независимая организация, собирающая представителей светлой и темной магии. Ее целью стало разрешение конфликтов, достижение компромиссов и установление новых правил и протоколов, которые позволили бы магам из обеих сторон сосуществовать в мире, где никто не был принужден отказываться от своей сущности.\n" +
                        "\n" +
                        "Герой стал главой Совета Магии. Его мудрость, смелость и способность видеть обе стороны помогли создать атмосферу доверия и взаимопонимания между магами. Он проводил сессии медиации, помогал сторонам устранять недопонимания и находить компромиссы.\n" +
                        "\n" +
                        "Совет Магии стал форумом, на котором маги могли обсуждать сложные вопросы, обмениваться знаниями и умениями, ища способы использования магии для блага вселенной. Герой учил магов из обеих сторон их собственным способам и помогал им увидеть ценность искусства друг друга.\n" +
                        "\n" +
                        "Со временем, благодаря работе Совета Магии, светлая и темная магия стали более взаимосвязанными и мирными. Маги поняли, что между ними больше общего, чем различий, и начали сотрудничать для достижения общей цели - защиты и развития магического наследия вселенной.\n" +
                        "\n" +
                        "Благодаря усилиям героя и Совета Магии, равновесие между светлой и темной магией было достигнуто. Светлая магия проникла в самые темные уголки мира, принося с собой надежду и исцеление, а темная магия нашла путь использования своих сил во имя защиты и справедливости.\n" +
                        "\n" +
                        "Таким образом, герой, став главой Совета Магии, привел вселенную к гармонии, где магические силы сосуществуют в равновесии, а границы между светом и тьмой стали менее заметными.",
                List.of(
                        new Variant(100, "Начать заново")
                ));
    }
}
