import java.util.Scanner;


public class PersonalityTest{

    private static char[] mbti = new char[4];
    private static String[] extrovertedVsIntroverted = new String[5];
    private static String[] sensingVsIntuitive = new String[5];
    private static String[] thinkingVsFeeling = new String[5];
    private static String[] judgingVsPerceptive = new String[5];


public static void main(String... babe){
  Scanner input = new Scanner(System.in);

         System.out.println("What is your name: ");
            String name = input.nextLine().to;



String[] answers = new String[20];






       

       for(int index = 0; index < answers.length; index++){
           System.out.println(getOptions(index));
             String type = input.nextLine().toUpperCase();
     
       while(!type.equals("A") && !type.equals("B")){
           System.out.println("\nExpected you to enter either A or B! \nretry?\n\n" +getOptions(index));
                     type = input.nextLine().toUpperCase();
    }
           answers[index] = type;
  
}



int exInCount = 0;
int sICount = 0;
int tFInCount = 0;
int jPInCount = 0;

for (int index = 0; index < answers.length; index += 4) {
	extrovertedVsIntroverted[exInCount] = answers[index];
	exInCount++;
}

for (int index = 1; index < answers.length; index += 4) {
	sensingVsIntuitive[sICount] = answers[index];
	sICount++;
}

for (int index = 2; index < answers.length; index += 4) {
	thinkingVsFeeling[tFInCount] = answers[index];
	tFInCount++;
}

for (int index = 3; index < answers.length; index += 4) {
	judgingVsPerceptive[jPInCount] = answers[index];
	jPInCount++;
}
	System.out.printf("%nHello %s, you selected%n", name);
	extrovertVsIntrovert();


        sensersVsIntuite();
  
       
        thinkersVsFeelers();


        judgeVsPercept();
	
	showMBTICombo();
       
        
      
}


public static void extrovertVsIntrovert() {
	int countA = 0;
	int countB = 0;
	int extroIntro = 0;
	int lineIndex = 0;
	String display = "";

	for (int index = 0; index < extrovertedVsIntroverted.length; index++) {
		if (extrovertedVsIntroverted[index].equals("A")) {
			lineIndex = getOptions(extroIntro).indexOf("\t");
			display = getOptions(extroIntro).substring(0, lineIndex);
			System.out.println(display);
			countA++;
		} 
		else {
			lineIndex = getOptions(extroIntro).indexOf("B");
			display = getOptions(extroIntro).substring(lineIndex);
			System.out.println(display);
			countB++;
		}
		extroIntro += 4;
	}

	System.out.println("Number of A selected: " + countA);
	System.out.println("Number of B selected: " + countB);

	if (countA > countB) mbti[0] = 'E';
	else mbti[0] = 'I';
 
}
  


public static void sensersVsIntuite() {
	int countA = 0;
	int countB = 0;
	int sensiIntui = 1;
	int lineIndex = 0;
	String display = "";

	for (int index = 0; index < sensingVsIntuitive.length; index++) {
		if (extrovertedVsIntroverted[index].equals("A")) {
			lineIndex = getOptions(sensiIntui).indexOf("\t");
			display = getOptions(sensiIntui).substring(0, lineIndex);
			System.out.println(display);
			countA++;
		} 
		else {
			lineIndex = getOptions(sensiIntui).indexOf("B");
			display = getOptions(sensiIntui).substring(lineIndex);
			System.out.println(display);
			countB++;
		}
		sensiIntui += 4;
	}

	System.out.println("Number of A selected: " + countA);
	System.out.println("Number of B selected: " + countB);

	if (countA > countB) mbti[1] = 'S';
	else mbti[1] = 'N';
 
}
  


public static void thinkersVsFeelers() {
	int countA = 0;
	int countB = 0;
	int thinkVsFeel = 2;
	int lineIndex = 0;
	String display = "";

	for (int index = 0; index < thinkingVsFeeling.length; index++) {
		if (extrovertedVsIntroverted[index].equals("A")) {
			lineIndex = getOptions(thinkVsFeel).indexOf("\t");
			display = getOptions(thinkVsFeel).substring(0, lineIndex);
			System.out.println(display);
			countA++;
		} 
		else {
			lineIndex = getOptions(thinkVsFeel).indexOf("B");
			display = getOptions(thinkVsFeel).substring(lineIndex);
			System.out.println(display);
			countB++;
		}
		thinkVsFeel += 4;
	}

	System.out.println("Number of A selected: " + countA);
	System.out.println("Number of B selected: " + countB);

	if (countA > countB) mbti[2] = 'T';
	else mbti[2] = 'F';
}


     public static void judgeVsPercept() {
	int countA = 0;
	int countB = 0;
	int judgeVsPercept = 3;
	int lineIndex = 0;
	String display = "";

	for (int index = 0; index < judgingVsPerceptive.length; index++) {
		if (extrovertedVsIntroverted[index].equals("A")) {
			lineIndex = getOptions(judgeVsPercept).indexOf("\t");
			display = getOptions(judgeVsPercept).substring(0, lineIndex);
			System.out.println(display);
			countA++;
		} 
		else {
			lineIndex = getOptions(judgeVsPercept).indexOf("B");
			display = getOptions(judgeVsPercept).substring(lineIndex);
			System.out.println(display);
			countB++;
		}
		judgeVsPercept += 4;
	}

	System.out.println("Number of A selected: " + countA);
	System.out.println("Number of B selected: " + countB);

	if (countA > countB) mbti[3] = 'J';
	else mbti[3] = 'P';
}



public static String getOptions(int index) {
	
String[] options = new String[20];

options[0] = "A. expand energy, enjoy groups  \t\t B. conserve energy, enjoy one-on-one";
options[1] = "A.Interpret literally \t\t B. look for meaning and posibilities";
options[2] = "A. logical, thinking, questioning \t\t B. empathic, feeling, accomodating";
options[3] = "A. organized, orderly \t\t B. flexible, adaptable";
options[4] = "A. more outgoing, think out loud \t\t B. more reserved, think to yourself";
options[5] = "A. practical, realistic, experiential \t\t B. imaginative, innovative, theoritical";
options[6] = "A. candid, straight forward, frank \t\t B. tactful, kind, encouraging";
options[7] = "A. plan, schedule \t\t B. unplanned, spontenous";
options[8] = "A. seek many tasks, public activities, interaction with others \t\t B.seek private, solitary activities with quiet to concentrate";
options[9] = "A. standard, usual, conventional \t\t B. different, novel, unique";
options[10] = "A. firm, tend to criticize, hold the line \t\t B. gentle, tend to appreciate, concilate";
options[11] = "A. regulated, structured \t\t B. easy-going, live and let live";
options[12] = "A. external, communicative, express yourself \t\t B. internal, reticent, keep to yourself";
options[13] = "A. focus on here-and-now \t\t B. look to the future, global perspective, big picture";
options[14] = "A. tough-minded, just \t\t B. tender-hearted, merciful";
options[15] = "A. preparation, plan ahead \t\t B. go with the flow, adapt as you go";
options[16] = "A. active, initiate \t\t B. reflective, deliberate";
options[17] = "A. facts, things, what is \t\t B. ideas, what could be, philosophical";
options[18] = "A. matter of fact, issue-oriented \t\t B. sensitive, people oriented, compassionate";
options[19] =  "A. control, govern \t\t B. latitude, freedom";

	return options[index];
  }


public static void showMBTICombo(){
 
  String mbtiCollection = new String(mbti);
   System.out.println(mbtiCollection);

switch (mbtiCollection){
	case "INFP":
		System.out.println("""
						The INFP Personality Type
						
							Healer
							The Thoughtful Idealist(MBTI)
							The Mediator(16Personalities)
						
						INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer,
						possibilities are paramount; the realism of the moment is only of passing concern. They see
						potential for a better future, and pursue truth and meaning with their own individual flair.

						INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal
						growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each
						person must find their own path. They enjoy spending time exploring their own ideas and values,
						and are gently encouraging to others to do the same. INFPs are creative and often artistic; they
						enjoy finding new outlets for self-expression.

						What does INFP stand for
						INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands for Introversion, iNtuition,
						Feeling, and Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are
						energized by time alone (Introverted), focus on ideas and concepts rather than facts and details
						(iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous
						and flexible rather than planned and organized (Perceiving).""");
                           break;


     

case("INTJ"):
				System.out.println("""
						The INTJ Personality Type

							Mastermind
							The Conceptual Planner(MBTI)
							The Architect(16Personalities)						

						INTJs are analytical problem-solvers, eager to improve systems and processes with their
						innovative ideas. They have a talent for seeing possibilities for improvement, whether at
						work, at home, or in themselves.

						Often intellectual, INTJs enjoy logical reasoning and complex problem-solving. They approach
						life by analyzing the theory behind what they see, and are typically focused inward, on their own
						thoughtful study of the world around them. INTJs are drawn to logical systems and are much less
						comfortable with the unpredictable nature of other people and their emotions. They are typically
						independent and selective about their relationships, preferring to associate with people who they
						find intellectually stimulating.

						What does INTJ stand for
						INTJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INTJ stands for Introverted, iNtuitive,
						Thinking, Judging, which are four core personality traits based on the work of psychologist C.G.
						Jung.

						Each of the four letters of the INTJ code signifies a key personality trait of this type. INTJs are
						energized by time alone (Introverted), focus on ideas and concepts rather than facts and details
						(iNtuitive), make decisions based on logic and reason (Thinking) and prefer to be planned and
						organized rather than spontaneous and flexible (Judging).""");

				break;

			case("INFJ"):
				System.out.println("""
						The INFJ Personality Type
							
							Counselor
							The Insightful Visionary(MBTI)
							The Advocate(16Personalities)
						
						NFJs are thoughtful nurturers with a strong sense of personal integrity and a drive to help others
						realize their potential. Creative and dedicated, they have a talent for helping others with original
						solutions to their personal challenges.

						The Counselor has a unique ability to intuit others' emotions and motivations, and will often
						know how someone else is feeling before that person knows it himself. They trust their insights
						about others and have strong faith in their ability to read people. Although they are sensitive,
						they are also reserved; the INFJ is a private sort, and is selective about sharing intimate thoughts
						and feelings.

						INFJs search for meaning and purpose in their lives and in the outer world. They tend to have an
						immense interest in deeply understanding culture, society, and the universe as a whole. INFJs
						naturally see how every thought or action could potentially have important consequences, either
						positive or negative. This reflective and curious worldview gives INFJs a unique perspective and
						thoughtful approach to how they interact with others and the world around them.

						Ultimately, INFJs seek to turn their abstract and intellectual musings into concrete actions that
						can be applied and make a transformative impact on others. Although it is common for INFJs to
						get stuck in their heads and struggle with taking action, when they are at their best, their actions
						are aligned with their authentic values.

						What does INFJ stand for
						INFJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators
						of the Myers-Briggs Type Indicator (MBTI®). 

						Each of the four letters of the INFJ code signifies a key personality trait of this type. The letters
						INFJ stand for the following dimensions of personality, based on the work of psychologist C.G. Jung:

						Introverted: INFJs are energized by time alone
						iNtuitive: INFJs focus on ideas and concepts rather than facts and details
						Feeling: INFJs make decisions based on feelings and values
						Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible
						""");

				break;

			case("INTP"):
				System.out.println("""
						The INTP Personality Type

							Architect
							The Objective Analyst(MBTI)
							The Logician(16Personalities)								

						INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer,
						possibilities are paramount; the realism of the moment is only of passing concern. They see
						potential for a better future, and pursue truth and meaning with their own individual flair.
	
						INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal
						growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each
						person must find their own path. They enjoy spending time exploring their own ideas and values,
						and are gently encouraging to others to do the same. INFPs are creative and often artistic; they 
						enjoy finding new outlets for self-expression.

						What does INTP stand for
						INTP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). INTP stands for Introverted, iNtuitive, 
						Thinking, Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						The INTP type describes a person who is energized by time alone (Introverted), who focuses on
						ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic
						and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and
						organized (Perceiving).""");

				break;

			case("ENFJ"):
				System.out.println("""
						The ENFJ Personality Type

							Teacher
							The Protagonist(16Personalities)	
					
						ENFJs are idealist organizers, driven to implement their vision of what is best for humanity. They
						often act as catalysts for human growth because of their ability to see potential in other people
						and their charisma in persuading others to their ideas. They are focused on values and vision, and
						are passionate about the possibilities for people.

						ENFJs are typically energetic and driven, and often have a lot on their plates. They are tuned into
						the needs of others and acutely aware of human suffering; however, they also tend to be 
						optimistic and forward-thinking, intuitively seeing opportunity for improvement. The ENFJ is 
						ambitious, but their ambition is not self-serving: rather, they feel personally responsible for
						making the world a better place.

						What does ENFJ stand for
						ENFJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Feeling, Judging. ENFJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on ideas and
						concepts rather than facts and details (iNtuitive), who makes decisions based on feelings and
						values (Feeling) and who prefers to be planned and organized rather than spontaneous and
						flexible (Judging).""");

				break;

			case("ENTP"):
				System.out.println("""
						The ENTP Personality Type

							Visionary
							The Debater(16Personalities)
												
						ENTPs are inspired innovators, motivated to find new solutions to intellectually challenging
						problems. They are curious and clever, and seek to comprehend the people, systems, and
						principles that surround them. Open-minded and unconventional, Visionaries want to analyze,
						understand, and influence other people.

						ENTPs enjoy playing with ideas and especially like to banter with others. They use their quick wit
						and command of language to keep the upper hand with other people, often cheerfully poking fun
						at their habits and eccentricities. While the ENTP enjoys challenging others, in the end they are
						usually happy to live and let live. They are rarely judgmental, but they may have little patience for
						people who can't keep up.
	
						What does ENTP stand for
						ENTP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Thinking, Perceiving. ENTP
						indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas
						and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and
						reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and 
						organized (Perceiving).""");

				break;

			case("ENTJ"):
				System.out.println("""
						The ENTJ personality type

							Commander
							The Commander(16Personalities)
					
						ENTJs are strategic leaders, motivated to organize change. They are quick to see inefficiency and
						conceptualize new solutions, and enjoy developing long-range plans to accomplish their vision.
						They excel at logical reasoning and are usually articulate and quick-witted.

						ENTJs are analytical and objective, and like bringing order to the world around them. When
						there are flaws in a system, the ENTJ sees them, and enjoys the process of discovering and
						implementing a better way. ENTJs are assertive and enjoy taking charge; they see their role as
						that of leader and manager, organizing people and processes to achieve their goals.

						What does ENTJ stand for
						ENTJ is an acronym used to describe one of the sixteen personality types created by Katharine 
						Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Thinking, Judging. ENTJ indicates
						a person who is energized by time spent with others (Extraverted), who focuses on ideas and
						concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");

				break;

			case("ENFP"):
				System.out.println("""
						The ENFP personality type

							Champion
							The Campaigner(16Personalities)				
				
						ENFPs are people-centered creators with a focus on possibilities and a contagious enthusiasm for
						new ideas, people and activities. Energetic, warm, and passionate, ENFPs love to help other
						people explore their creative potential.

						ENFPs are typically agile and expressive communicators, using their wit, humor, and mastery of
						language to create engaging stories. Imaginative and original, ENFPs often have a strong artistic
						side. They are drawn to art because of its ability to express inventive ideas and create a deeper
						understanding of human experience.

						What does ENFP stand for
						ENFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers,
						creators of the Myers-Briggs Type Indicator (MBTI®). ENFP stands for Extraversion, iNtuition,
						Feeling, and Perceiving, which are four core personality traits based on the work of psychologist
						C.G. Jung.

						Each of the four letters of the ENFP code signifies a key personality trait of this type. ENFPs are
						energized by time spent with others (Extraverted), focus on ideas and concepts rather than facts
						and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be
						spontaneous and flexible rather than planned and organized (Perceiving).""");

				break;


			case("ISFJ"):
				System.out.println("""
						The ISFJ Personality Type

							Protector
							The Defender(16Personalities)

						ISFJs are industrious caretakers, loyal to traditions and organizations. They are practical,
						compassionate, and caring, and are motivated to provide for others and protect them from the
						perils of life.

						ISFJs are conventional and grounded, and enjoy contributing to established structures of society.
						They are steady and committed workers with a deep sense of responsibility to others. They focus
						on fulfilling their duties, particularly when they are taking care of the needs of other people.
						They want others to know that they are reliable and can be trusted to do what is expected of 
						them. They are conscientious and methodical, and persist until the job is done.

						What does ISFJ stand for
						ISFJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, Judging. ISFJ indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");
				break;
	
			case("ISFP"):
				System.out.println("""
						The ISFP Personality Type

							Composer
							The Adventurer(16Personalities)				

						ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with
						cheerful, low-key enthusiasm. They are flexible and spontaneous, and like to go with the flow to
						enjoy what life has to offer. ISFPs are quiet and unassuming, and may be hard to get to know.
						However, to those who know them well, the ISFP is warm and friendly, eager to share in life's
						many experiences.

						ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are attuned
						to sensory experience, and often have a natural talent for the arts. ISFPs especially excel at
						manipulating objects, and may wield creative tools like paintbrushes and sculptor's knives with
						great mastery.

						What does ISFP stand for
						ISFP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, Perceiving. ISFP indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");
				break;


			case("ISTJ"):
				System.out.println("""
						The ISTJ Personality Type
							
							The Inspector
							Logician(16Personalities)							

						ISTJs are responsible organizers, driven to create and enforce order within systems and
						institutions. They are neat and orderly, inside and out, and tend to have a procedure for
						everything they do. Reliable and dutiful, ISTJs want to uphold tradition and follow regulations.

						ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are rarely isolated;
						typical ISTJs know just where they belong in life, and want to understand how they can
						participate in established organizations and systems. They concern themselves with maintaining
						the social order and making sure that standards are met.

						What does ISTJ stand for
						ISTJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking, Judging. ISTJ indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");
				break;

			case("ISTP"):
				System.out.println("""
						The ISTP Personality Type

							Craftsperson							
							The Virtuoso(16Personalities)
				
						ISTPs are observant artisans with an understanding of mechanics and an interest in
						troubleshooting. They approach their environments with a flexible logic, looking for practical
						solutions to the problems at hand. They are independent and adaptable, and typically interact
						with the world around them in a self-directed, spontaneous manner.

						ISTPs are attentive to details and responsive to the demands of the world around them. Because
						of their astute sense of their environment, they are good at moving quickly and responding to
						emergencies. ISTPs are reserved, but not withdrawn: the ISTP enjoys taking action, and
						approaches the world with a keen appreciation for the physical and sensory experiences it has to
						offer.

						What does ISTP stand for
						ISTP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking, Perceiving. ISTP indicates a
						person who is energized by time spent alone (Introverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");
				break;

			case("ESFJ"):
				System.out.println("""
						The ESFJ Personality Type

							Provider
							The Consul(16Personalities)	

						ESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to
						their responsibilities. They are highly attuned to their emotional environment and attentive to
						both the feelings of others and the perception others have of them. ESFJs like a sense of harmony
						and cooperation around them, and are eager to please and provide.

						ESFJs value loyalty and tradition, and usually make their family and friends their top priority.
						They are generous with their time, effort, and emotions. They often take on the concerns of
						others as if they were their own, and will attempt to put their significant organizational talents to
						use to bring order to other people's lives.

						What does ESFJ stand for
						ESFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs
						and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Judging. ESFJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging).""");

				break;

			case("ESFP"):
				System.out.println("""
						The ESFP Personality Type

							Performer
							The Entertainer(16Personalities)
				
						ESFPs are vivacious entertainers who charm and engage those around them. They are
						spontaneous, energetic, and fun-loving, and take pleasure in the things around them: food,
						clothes, nature, animals, and especially people.

						ESFPs are typically warm and talkative and have a contagious enthusiasm for life. They like to be
						in the middle of the action and the center of attention. They have a playful, open sense of humor,
						and like to draw out other people and help them have a good time.

						What does ESFP stand for
						ESFP is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling, Perceiving. ESFP indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on feelings and values
						(Feeling) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving). """);

				break;

			case("ESTJ"):
				System.out.println("""
						The ESTJ personality type
		
							Supervisor
							Executive(16Personalities)		

						ESTJs are hardworking traditionalists, eager to take charge in organizing projects and people.
						Orderly, rule-abiding, and conscientious, ESTJs like to get things done, and tend to go about
						projects in a systematic, methodical way.

						ESTJs are the consummate organizers, and want to bring structure to their surroundings. They
						value predictability and prefer things to proceed in a logical order. When they see a lack of
						organization, the ESTJ often takes the initiative to establish processes and guidelines, so that
						everyone knows what's expected.

						What does ESTJ stand for
						ESTJ is an acronym used to describe one of the sixteen personality types created by Katharine
						Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Judging. ESTJ indicates a
						person who is energized by time spent with others (Extraverted), who focuses on facts and details
						rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible
						(Judging). """);
				break;

			case("ESTP"):
				System.out.print("""
						The ESTP personality type
							
							Dynamo
							The Entrepreneur(16Personalities)	

						ESTPs are energetic thrill-seekers who are at their best when putting out fires, whether literal or
						metaphorical. They bring a sense of dynamic energy to their interactions with others and the
						world around them. They assess situations quickly and move adeptly to respond to immediate
						problems with practical solutions.

						Active and playful, ESTPs are often the life of the party and have a good sense of humor. They use
						their keen powers of observation to assess their audience and adapt quickly to keep interactions
						exciting. Although they typically appear very social, they are rarely sensitive; the ESTP prefers to
						keep things fast-paced and silly rather than emotional or serious.

						What does ESTP stand for
						ESTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs
						and Isabel Myers. It stands for Extraverted, Sensing, Thinking, Perceiving. ESTP indicates
						a person who is energized by time spent with others (Extraverted), who focuses on facts and
						details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason
						(Thinking) and who prefers to be spontaneous and flexible rather than planned and organized
						(Perceiving).""");

				break;
		}

	}


}