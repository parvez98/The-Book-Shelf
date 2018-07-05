package edu.purdue.parvezs.thebookshelf;

import android.os.RemoteCallbackList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<BookData> bookDataList;
    private RecyclerView view;
    private BookAdapter bookadapter;
    private int[] cmbynSlide = {R.drawable.cmbynone, R.drawable.cmbyntwo, R.drawable.cmbynthree, R.drawable.cmbynfour, R.drawable.cmbynfive };
    private int[] reasonsSlide = {R.drawable.reasonsone, R.drawable.reasonseight, R.drawable.reasonsseven, R.drawable.reasonsfour, R.drawable.reasonsfive};
    private int[] everythingSlide = {R.drawable.everythingone, R.drawable.everythingtwo, R.drawable.everythingthree, R.drawable.everythingfour, R.drawable.everythingfive};
    private int[] harrySlide = {R.drawable.harryone, R.drawable.harrytwo, R.drawable.harrythree, R.drawable.harryfour, R.drawable.harryfive};
    private int[] simonSlide = {R.drawable.simonfive, R.drawable.simontwo, R.drawable.simonthree, R.drawable.simonfour, R.drawable.simonone};
    private int[] fantasticSlide = {R.drawable.fantasticfive, R.drawable.fantastictwo, R.drawable.fantasticthree, R.drawable.fantasticfour, R.drawable.fantasticone};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookDataList = new ArrayList<>();
        bookDataList.add(new BookData("Call Me By Your Name", "Andre Aciman", "Love Story", "It's the summer of 1983, and precocious 17-year-old Elio Perlman is spending the days with his family at their 17th-century villa in Lombardy, Italy. He soon meets Oliver, a handsome doctoral student who's working as an intern for Elio's father. Amid the sun-drenched splendor of their surroundings, Elio and Oliver discover the heady beauty of awakening desire over the course of a summer that will alter their lives forever.", R.drawable.cmbyn, cmbynSlide));
        bookDataList.add(new BookData("13 Reasons Why", "Jay Asher", "Teenage", "Clay Jensen returns home from school to find a mysterious box with his name on it lying on his porch. Inside he discovers cassette tapes recorded by Hannah Baker—his classmate and crush—who committed suicide two weeks earlier. On tape, Hannah explains that there are thirteen reasons why she decided to end her life.", R.drawable.reasons, reasonsSlide));
        bookDataList.add(new BookData("Everything Everything", "Nicola Yoon", "Love Story", "Maddy is a smart, curious and imaginative 18-year-old who is unable to leave the protection of the hermetically-sealed environment within her house because of an illness. Olly is the boy next door who won't let that stop them from being together. Gazing through windows and talking only through texts, Maddy and Olly form a deep bond that leads them to risk everything to be together, even if it means losing everything.", R.drawable.everything, everythingSlide));
        bookDataList.add(new BookData("Harry Potter and The Cursed Child", "J.K. Rowling", "Magic", "The book begins at King's Cross Station, with Harry's and Hermione's respective children—Albus Potter and Rose Granger-Weasley—going off to Hogwarts for the first time. Albus is afraid he will break the family tradition and be sorted into Slytherin rather than Gryffindor.", R.drawable.harry, harrySlide));
        bookDataList.add(new BookData("Simon vs A Agenda Homo Sapiens", "Becky Albertalli", "Love Story", "Everyone deserves a great love story, but for 17-year-old Simon Spier, it's a little more complicated. He hasn't told his family or friends that he's gay, and he doesn't know the identity of the anonymous classmate that he's fallen for online. Resolving both issues proves hilarious, terrifying and life-changing.", R.drawable.simon, simonSlide));
        bookDataList.add(new BookData("The Picture of Dorian Gray", "Oscar Wilde", "Love Story", "The Picture of Dorian Grey is a novel about a young man whose desire to maintain his youth and beauty renders his soul irrevocably damaged. When Dorian expresses a desire for his portrait to grow old and wither in his stead, he is shocked to find his wish has been granted. As he gets older, it is his picture that ages physically and not him. By virtue of his narcissism, wonton hedonism, and disregard for others, his portrait grown uglier and uglier. There are allusions in the text that indicate the portrait as a representation of his soul. In the end, the picture is restored to its original beauty when Dorian attempts to destroy it and is instead found lying on the ground, old and ugly as he should have been, dead.", R.drawable.dorian, simonSlide));
        bookDataList.add(new BookData("Beautiful Boy", "David Sheff", "Love Story", " Beautiful Boy is all the more moving in that it details Sheff’s personal narrative of battling with his own son’s substance abuse. Many people view addiction and recovery as an entirely personal matter. Sheff, however, shows that addiction does not just affect the addicted individual, but those around the individual as well. The narrative highlights how, in reality, it is more than one person suffering from addiction, and more than one person attempting to recover and find a sense of normalcy after the revelation of addiction.", R.drawable.beautiful, simonSlide));
        bookDataList.add(new BookData("Charlie and the Chocolate Factory", "Ronald Dahl", "Love Story", "Based on the beloved Roald Dahl tale, this comedic and fantastical film follows young Charlie Bucket and his Grandpa Joe as they join a small group of contest winners who get to tour the magical and mysterious factory of eccentric candy maker Willy Wonka. Aided by his diminutive Oompa Loompa workers, Wonka has a hidden motivation for the tour, one that he will reveal only after the children in the group show their true colors.", R.drawable.charlie, simonSlide));
        bookDataList.add(new BookData("The Vampire Dairies", "L.J. Smith", "Love Story", "After centuries of quarreling, Stefan and Damon Salvatore return to their original town of Mystic Fall Virginia. Stefan, the selfless, brave, guilt ridden brothers meets a high school girl named Elena Gilbert who he instantly falls in love with. While Damon the gorgeous, dangerous, and selfish vampire is after his brothers girl to pay him back for making him turn into a vampire in 1864.", R.drawable.vampire, simonSlide));
        bookDataList.add(new BookData("The Accidental Billionares", "Ben Mezrich", "Love Story", "In 2003, Harvard undergrad and computer genius Mark Zuckerberg begins work on a new concept that eventually turns into the global social network known as Facebook. Six years later, he is one of the youngest billionaires ever, but Zuckerberg finds that his unprecedented success leads to both personal and legal complications when he ends up on the receiving end of two lawsuits, one involving his former friend.", R.drawable.billionares, simonSlide));
        bookDataList.add(new BookData("Percy Jackson and The Ligthning Thief", "Rick Riordan", "Love Story", "Always trouble-prone, the life of teenager Percy Jackson gets a lot more complicated when he learns he's the son of the Greek god Poseidon. At a training ground for the children of deities, Percy learns to harness his divine powers and prepare for the adventure of a lifetime: he must prevent a feud among the Olympians from erupting into a devastating war on Earth, and rescue his mother from the clutches of Hades, god of the underworld.", R.drawable.percy, simonSlide));
        bookDataList.add(new BookData("Fantastic Beasts and Where to Find Them", "J.K. Rowling", "Love Story", "The year is 1926, and Newt Scamander has just completed a global excursion to find and document an extraordinary array of magical creatures. Arriving in New York for a brief stopover, he might have come and gone without incident, were it not for a No-Maj (American for Muggle) named Jacob, a misplaced magical case, and the escape of some of Newt's fantastic beasts, which could spell trouble for both the wizarding and No-Maj worlds.", R.drawable.fantastic, fantasticSlide));
        bookDataList.add(new BookData("The Hunger Games", "Suzanne Collins", "Love Story", "In what was once North America, the Capitol of Panem maintains its hold on its 12 districts by forcing them each to select a boy and a girl, called Tributes, to compete in a nationally televised event called the Hunger Games. Every citizen must watch as the youths fight to the death until only one remains. District 12 Tribute Katniss Everdeen has little to rely on, other than her hunting skills and sharp instincts, in an arena where she must weigh survival against love.", R.drawable.hunger, simonSlide));
        bookDataList.add(new BookData("A Game of Thrones", "George R.R. Martin", "Love Story", "The longest part of this book tells how the noble Stark family deals with conspiracy and court politics in the Seven Kingdoms of Westeros, with particular emphasis on Eddard Stark, the father and leader of the noble family. A second story follows the exiled princess Daenerys, one of the last descendants from the previous royal family, as she grows up on another continent. A third story follows Jon Snow, the illegitimate son of Eddard Stark, as he grows up in the north of Westeros. He is in the special military order called the Night's Watch, which is dedicated to protecting the civilized Seven Kingdoms from the dangers beyond the Wall.", R.drawable.thrones, simonSlide));
        bookDataList.add(new BookData("Twilight", "Stephenie Meyer", "Love Story", "High-school student Bella Swan, always a bit of a misfit, doesn't expect life to change much when she moves from sunny Arizona to rainy Washington state. Then she meets Edward Cullen, a handsome but mysterious teen whose eyes seem to peer directly into her soul. Edward is a vampire whose family does not drink blood, and Bella, far from being frightened, enters into a dangerous romance with her immortal soulmate.", R.drawable.twilight, simonSlide));
        bookDataList.add(new BookData("Fault in Our Stars", "John Green", "Love Story", "Hazel Grace Lancaster, a 16-year-old cancer patient, meets and falls in love with Gus Waters, a similarly afflicted teen from her cancer support group. Hazel feels that Gus really understands her. They both share the same acerbic wit and a love of books, especially Grace's touchstone, \"An Imperial Affliction\" by Peter Van Houten. When Gus scores an invitation to meet the reclusive author, he and Hazel embark on the adventure of their brief lives.", R.drawable.fault, simonSlide));
        bookDataList.add(new BookData("Divergent", "Veronica Roth", "Love Story", "Tris Prior lives in a futuristic world in which society is divided into five factions. As each person enters adulthood, he or she must choose a faction and commit to it for life. Tris chooses Dauntless -- those who pursue bravery above all else. However, her initiation leads to the discovery that she is a Divergent and will never be able to fit into just one faction. Warned that she must conceal her status, Tris uncovers a looming war which threatens everyone she loves.", R.drawable.divergent, simonSlide));
        bookDataList.add(new BookData("50 Shades of Grey", "E.L. James", "Love Story", "When college senior Anastasia Steele steps in for her sick roommate to interview prominent businessman Christian Grey for their campus paper, little does she realize the path her life will take. Christian, as enigmatic as he is rich and powerful, finds himself strangely drawn to Ana, and she to him. Though sexually inexperienced, Ana plunges headlong into an affair and learns that Christian's true sexual proclivities push the boundaries of pain and pleasure.", R.drawable.shades, simonSlide));
        bookDataList.add(new BookData("Red Sparrow", "Jason Matthews", "Love Story", "Prima ballerina Dominika Egorova faces a bleak and uncertain future after she suffers an injury that ends her career. She soon turns to Sparrow School, a secret intelligence service that trains exceptional young people to use their minds and bodies as weapons. Egorova emerges as the most dangerous Sparrow after completing the sadistic training process. As she comes to terms with her new abilities, Dominika meets a CIA agent who tries to convince her that he is the only person she can trust.\n", R.drawable.red, simonSlide));
        bookDataList.add(new BookData("The Jungle Book", "Rudyard Kipling", "Love Story", "Raised by a family of wolves since birth, Mowgli must leave the only home he's ever known when the fearsome tiger Shere Khan unleashes his mighty roar. Guided by a no-nonsense panther and a free-spirited bear, the young boy meets an array of jungle animals, including a slithery python and a smooth-talking ape. Along the way, Mowgli learns valuable life lessons as his epic journey of self-discovery leads to fun and adventure.", R.drawable.jungle, simonSlide));
        bookDataList.add(new BookData("Jurassic Park", "Michael Crichton", "Love Story", "Paleontologists Alan Grant and Ellie Sattler and mathematician Ian Malcolm are among a select group chosen to tour an island theme park populated by dinosaurs created from prehistoric DNA. While the park's mastermind, billionaire John Hammond (Richard Attenborough), assures everyone that the facility is safe, they find out otherwise when various ferocious predators break free and go on the hunt.", R.drawable.park, simonSlide));
        bookDataList.add(new BookData("Me Before You", "Jojo Moyes", "Love Story", "Young and quirky Louisa Clark moves from one job to the next to help her family make ends meet. Her cheerful attitude is put to the test when she becomes a caregiver for Will Traynor, a wealthy young banker left paralyzed from an accident two years earlier. Will's cynical outlook starts to change when Louisa shows him that life is worth living. As their bond deepens, their lives and hearts change in ways neither one could have imagined.", R.drawable.me, simonSlide));


        view = (RecyclerView)findViewById(R.id.recyclerView);
        bookadapter = new BookAdapter(this, bookDataList);
        view.setLayoutManager(new GridLayoutManager(this, 2));
        view.setAdapter(bookadapter);
    }
}
