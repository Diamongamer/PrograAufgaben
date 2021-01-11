```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
aaProf.Dr.J.Giesl D.Clo erkes,S.Dollase,D.Meier

```
AllgemeineHinweise:
```
- DieDeadlinezurAbgab ederHausaufgab enistamMittwo ch,den13.01.2021,um12:00Uhr.
- DerWorkowsiehtwiefolgtaus.DieAbgab ederHausaufgab enerfolgtimMo o dle-Lernraumund
  kannnurinZweiergrupp enstattnden.Dab eidürfendieAbgab epartner*innenverschiedeneTutorien
  b esuchen.Esdarfnurein*eAbgab epartner*indieAbgab eho chladen.Diese*rmusssowohldieLösung
  alsauchdenCo deho chladen.DieBepunktungwirddannvonunsfürb eideAbgab epartner*innen
  separat imLernraumeingetragen.DieFeedbackdateiistjedo chnurfür denStudierendensichtbar,
  derauchdieAbgab eho chgeladenhatundmussvondiesemandie*denandere*nAbgab epartner*in
  weitergeleitetwerden.
- DieLösungmussalsPDF-Dateiho chgeladenwerden.DamitdiePunkteb eidenAbgab epartner*innen
  zugeordnetwerdenkönnen,mussob enaufdererstenSeiteIhrerLösungderName,dieMatrikel-
  nummersowiedieNummerderTutorienvonb eidenAbgab epartner*innenangegeb ensein.
- DerCo demussals.zip-Dateiho chgeladenwerdenundzusätzlichinderPDF-DateimitIhrerLösung
  enthaltensein,so dassunsereTutor*innenihnmitFeedbackversehenkönnen.
  AufdiesemBlattmussIhreCo deabgab eIhrenvollständigenJava-Co deinFormvon .java-Dateien
  enthalten.AusdemLernraumheruntergeladeneKlassen,etwadieDateiSimpleIO.java,dürfennicht
  mitabgegeb enwerden.
  StellenSiesicher,dassIhrProgrammvonjavacakzeptiertwird,wenndieentsprechendenKlassenaus
  demLernraumhinzugefügtwerden.AnsonstenwerdenkeinePunktevergeb en.
- EinigeHausaufgab enmüssenimSpielCodescapegelöstwerden.KlickenSiedazuimLernraumrechts
  imBlo ckCodescape aufdenangegeb enenLink.DieseAufgab enwerdengetrenntvondenanderen
  Hausaufgab engewertet.
- DieTeilaufgab e4h)verwendeteineCollection-KlasseundkanndahererstmitdemStoausderVorlesung
  vom06.01.2021gelöstwerden.

# Tutoraufgab e 1 (Üb erblickswissen(Video)):

```
a)WiekanndieNutzungvonInterfacesdab eihelfen,dieEntwicklungeinesgröÿerenProgrammsaufmeh-
rereEntwicklerzuverteilen?
```
```
b)WelchesProblemkannauftreten,wennmanzuvieledefault-ImplementierungeninInterfacesnutzt?
```
```
c)Warumsinddefault-ImplementierungeninInterfacesmanchmaldenno chsinnvoll?
```
```
d)Warumistessinnvoll,dassineinemInterfacekeinenicht-statischenAttributedeniertwerdenkönnen?
```
# Tutoraufgab e 2 (Weihnachtsmarkt(2Videos)):

IndieserAufgab esolleinWeihnachtsmarktmo delliertwerden.VerwendenSiehierfürdieHilfsklassenZufall
undSimpleIO,dieb eideimLernraumzundensind.

- EinWeihnachtsmarktb estehtausverschiedenenStänden.EinWeihnachtsmarktverfügtauÿerdemüb er
  eineMetho derun(),diekeinErgebniszurückgibt.
- EinStandkannentwedereinWeihnachtsartikelstando dereinLeb ensmittelstandsein.JederStandhat
  einenVerkäufer,dessenNamevonInteresseist,undeineAnzahlvonBesuchernproStunde.Hierfürexis-
  tiertsowohleinAttributbesucherProStundealsaucheineMetho deberechneBesucherProStunde(),
  umdieseAnzahlneuzub erechnen.EinStandbietetauÿerdemdieMetho deeinzelkauf(),welcheden
  zub ezahlendenPreis(centgenauinEuro)zurückgibt.


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
- EinWeihnachtsartikelstandhateineReiheanArtikeln.
- EinArtikelhateinenNamenundeinenPreis(centgenauinEuro).
- EinLeb ensmittelstandverkaufteinb estimmtesLeb ensmittel.
- EinLeb ensmittelistentwedereinFlammkucheno dereineSüÿware.EsbietetdieMöglichkeit,üb erdie
  Metho dengetPreisPro100g()undgetName(),denfestenPreispro 100 Gramm(centgenauinEuro)
  unddenNamenabzurufen.
- BeieinerSüÿwareistderPreispro 100 Gramm(centgenauinEuro)unddieSüÿwarenartalsStringvon
  Interesse.
- BeieinemFlammkuchenistderPreispro 100 Gramm(centgenauinEuro)vonInteresse.
- EinSüÿwarenstandisteinLeb ensmittelstand.
- ImGegensatzzuFlammkuchenständen,dieeinenfestenWasseranschlussb enötigen,lassensichWeih-
  nachtsartikelständeundSüÿwarenständemiteinerMetho deverschiebe(int)ohneRückgab everschie-
  b en.Dieswirdregelmäÿigausgenutzt,fallsdieAnzahlderBesuchererhöhtwerdensoll.

a)EntwerfenSieunterBerücksichtigungderPrinzipienderDatenkapselungeinegeeigneteKlassenhierarchie
füreinenWeihnachtsmarkt.NotierenSiekeineKonstruktoren,Gettero derSetter(bisaufgetPreisPro100g
undgetName).Siemüssennichtmarkieren,obAttributefinalseinsollen.AchtenSiedarauf,dassge-
meinsameMerkmaleinOb erklassenbzw.Interfaceszusammengefasstwerden.
VerwendenSiehierb eidiegleicheNotationwieinderHausaufgab e(Aufgab e3).

b)ImplementierenSiedieKlassenentsprechendIhrerKlassenhierarchie.Nutzen SiedafürdieKlassen
ZufallundSimpleIO(ausdemLernraum).FügenSiejederKlasse,fallsnotwendig,GetterundSetter
sowieeinegeeignetetoString-Metho dehinzu.

```
c)DieKlasseLebensmittelstandsolleinengenerischenTypparameterTerhalten,welcherLebensmittel
o der eineUnterklassevonLebensmittelseinkann.DaseinzigeAttributlebensmittelderKlasse
LebensmittelstandsollvomTypTsein.DerKonstruktorerhälteinenParametervomTypTundweist
das Attribut entsprechend zu. Die Klasse Suesswarenstand ist Unterklasse von
Lebensmittelstand<Suessware>undb enötigteinenKonstruktor,welcherdensuper-Konstruktormit
einemSuessware-Ob jektaufruft.
```
d)InitialisierenSiedieAttributederOb jekteIhrerKlassenmithilfevon Zufall.javanachfolgendem
Schema:

- DerKonstrukturderKlasseWeihnachtsmarktb ekommtdieAnzahlderStändeüb ergeb enundlegt
  einArraymitentsprechendvielenStändenan.VerwendenSiediestatischeMetho deZufall.zahl(int)
  so,dassesjeweilsetwa33%Weihnachtsartikelstände,SüÿwarenständeundFlammkuchenstände
  gibt.Hierb eigibteinAufrufZufall.zahl(i)(fürigröÿer0)einezufälligeZahlzwischen 0 undi− 1
  zurück.EinFlammkuchenstandkannerzeugtwerden,indemderLebensmittelstand-Konstruktor
  miteinemFlammkuchen-Ob jektaufgerufenwird.
- DerNamedesVerkäuferseinesStandswirdmitderstatischenMetho deZufall.name()festgelegt.
- DieAnzahlderBesucherproStundeb ewegtsichzwischen 0 und 100 undsollmitderMetho de
  Zufall.zahl(int)festgelegtwerden.DieeinzigeAusnahmebildenWeihnachtsartikelstände,b ei
  denensichdieAnzahlderBesucherproStundedurchdieAdditionvonnZufallszahlenzwischen 0
  und 5 ergibt,wob eindieAnzahlderArtikeldesStandesist,dienichtnullsind(Artikelwerden
  späterdurchVerkaufenaufnullgesetzt).
- Ein Weihnachtsartikelstandhat zwischen 1 und 20 Artikel.SowohldieAnzahlderArtikelals
  auchdieArtikelselbst sollenzufälligausgewähltwerden.Verwenden SiehierfürdieMetho den
  Zufall.zahl(int)undZufall.artikel(),umdieAnzahl,dieNamenunddiePreisezub estim-
  men.DerPreiseinesArtikelssollzwischen 0 , 01 Euround 10 Euroliegen.
- BeieinemLeb ensmittelergibtsichderPreispro 100 GrammalsZufallszahlzwischen 0 , 01 Euro
  und 3 Euro.


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
- ZurBestimmungderSüÿwarenartsolldieMetho deZufall.suessware()genutztwerden.

```
e)Implementieren Sie die in Stand als abstract markierte Metho de einzelkauf in den Klassen
WeihnachtsartikelstandundLebensmittelstand.WeihnachtsartikelständesollenalleerhältlichenAr-
tikelauistenundfragen,welchenArtikelderKundekaufenmö chte.Anschlieÿendsolldergekaufte
ArtikelausdemSortimentgelöschtwerden,indemderentsprechendeEintragaufnullgesetztwird.
Leb ensmittelständesollennachfragen,wievielGrammderKundehab enmö chte.AmEndesollder
Gesamtpreiszurückgegeb enwerden,denderKundezahlenmuss.VerwendenSiehierb eidieMetho den
SimpleIO.getInt(String)undSimpleIO.getBoolean(String)zurInteraktionmitdemNutzer.Sie
dürfenweitereprivateHilfsmetho denanlegen,umdenCo deb esserlesbarzugestalten.
```
```
f )ImplementierenSiefürverschiebbareStändeeineMetho deverschiebe(int standID),diedieAnzahl
derBesucherproStundeneub erechnetundanschlieÿendeineMeldungausgibt,dassStandstandID
verschob enwurde,zusammenmitderInformation,vonwievielenPassantendieserStandnunstündlich
b esuchtwird.
FallseinWeihnachtsartikelstandverschob enwird,sob estehtdieMöglichkeit,dasseinerderArtikel
b eimVerschieb envomStandfälltundkaputtgeht.DerentsprechendeArtikelsollausdemSortiment
entferntwerdenundessolleineSchadensfallExceptiongeworfenwerden,welcheeineNachrichtenthält,
diedenSchadensfallb eschreibt.WählenSiedazub eimVerschieb eneinesWeihnachtsartikelstands
zufälligeinenIndexausdemartikel-Arrayaus.Istdieserb ereitsausverkauft(null),sopassiertnichts.
AnsonstenfälltdieserArtikelb eimVerschieb envomStand.
LegenSiedazudieKlasseSchadensfallExceptionan,welchevonExceptionerbtundeinenKonstruk-
torenthält,dereineFehlermeldungalsStringerhältundandensuper-Konstruktorweitergibt.Fügen
Sieauÿerdemeineentsprechendethrows-Klauselfürdieverschiebe-Metho dehinzu(auchamInterface
Verschiebbar).
SiedürfenweitereprivateHilfsmetho denanlegen,umdenCo deb esserlesbarzugestalten.
```
g)FügenSiederKlasseWeihnachtsmarkteinemain-Metho dehinzu.IndiesersolleinneuerWeihnachts-
marktmit 5 Ständenerstelltwerdenundanschlieÿenddessenrun-Metho deaufgerufenwerden.
Inderrun-Metho deb eginntdieersteRunde,inderalleStändedesWeihnachtsmarktesaufgelistetwerden
undderNutzergefragtwird,welchenStanderb esuchenmö chte.AndemausgewähltenStandsollder
KundesolangeEinzelkäufetätigenkönnen,bisermitdemEinkauffertigistunddenStandverlässt.Am
EndesollderGesamtpreisgenanntwerden,denderKundezahlenmuss.
AnschlieÿendsollenalleverschiebbarenStände,dievonwenigerals 30 PassantenproStundeb esucht
werden,verschob enwerden.ZumEndeeinerRundewirdderNutzergefragt,oberdenWeihnachtsmarkt
verlassenmö chte.Fallsdiesverneintwird,solldienächsteRundeb eginnen.
VerwendenSiedieMetho denSimpleIO.getInt(String)undSimpleIO.getBoolean(String)zurIn-
teraktionmitdemNutzer.
SiedürfenweitereprivateHilfsmetho denanlegen,umdenCo deb esserlesbarzugestalten.
EineLaufdesProgrammskönnteb eispielsweisediefolgendeAusgab eerzeugen:

```
Der Weihnachtsmarkt besteht aus folgenden Staenden:
```
```
0: Lebensmittelstand fuer Flammkuchen:
Preis pro 100g: 0.91 Euro
Verkaeufer: Sarah
Besucher pro Stunde: 21
```
```
1: Weihnachtsartikelstand:
Verkaeufer: Felix
Besucher pro Stunde: 9
```
```
2: Lebensmittelstand fuer Suessware (Zuckerstange):
Preis pro 100g: 2.05 Euro
Verkaeufer: Mattis
Besucher pro Stunde: 9
```

```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
3: Weihnachtsartikelstand:
Verkaeufer: Per
Besucher pro Stunde: 27

4: Lebensmittelstand fuer Suessware (Waffeln):
Preis pro 100g: 2.27 Euro
Verkaeufer: Fynn
Besucher pro Stunde: 50

Welchen Stand moechten Sie besuchen?
0
Guten Tag!
Wie viel Gramm moechten Sie?
200
200 Gramm fuer Sie. Lassen Sie es sich schmecken!
Darf es sonst noch etwas sein?
false
1.82 Euro, bitte.
Stand 1 wurde verschoben und wird jetzt von 9 Passanten pro Stunde besucht.
Dabei ist Artikel 1: Holzkrippe (3.7 Euro) leider vom Stand gefallen und kaputt gegangen.
Stand 2 wurde verschoben und wird jetzt von 26 Passanten pro Stunde besucht.
Stand 3 wurde verschoben und wird jetzt von 33 Passanten pro Stunde besucht.
Dabei ist Artikel 8: Tasse (9.1 Euro) leider vom Stand gefallen und kaputt gegangen.
Moechten Sie den Weihnachtsmarkt verlassen?
false
Der Weihnachtsmarkt besteht aus folgenden Staenden:

0: Lebensmittelstand fuer Flammkuchen:
Preis pro 100g: 0.91 Euro
Verkaeufer: Sarah
Besucher pro Stunde: 21

1: Weihnachtsartikelstand:
Verkaeufer: Felix
Besucher pro Stunde: 9

2: Lebensmittelstand fuer Suessware (Zuckerstange):
Preis pro 100g: 2.05 Euro
Verkaeufer: Mattis
Besucher pro Stunde: 26

3: Weihnachtsartikelstand:
Verkaeufer: Per
Besucher pro Stunde: 33

4: Lebensmittelstand fuer Suessware (Waffeln):
Preis pro 100g: 2.27 Euro
Verkaeufer: Fynn
Besucher pro Stunde: 50

Welchen Stand moechten Sie besuchen?
1
Guten Tag!
Unsere Artikel sind:
0: Rucksack (7.01 Euro)
1: ausverkauft
2: Kette (9.18 Euro)
Welchen Artikel moechten Sie kaufen?
0
Rucksack wird eingepackt. Viel Spass damit!


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
Darf es sonst noch etwas sein?
false
7.01 Euro, bitte.
Stand 1 wurde verschoben und wird jetzt von 2 Passanten pro Stunde besucht.
Stand 2 wurde verschoben und wird jetzt von 12 Passanten pro Stunde besucht.
Moechten Sie den Weihnachtsmarkt verlassen?
false
Der Weihnachtsmarkt besteht aus folgenden Staenden:

0: Lebensmittelstand fuer Flammkuchen:
Preis pro 100g: 0.91 Euro
Verkaeufer: Sarah
Besucher pro Stunde: 21

1: Weihnachtsartikelstand:
Verkaeufer: Felix
Besucher pro Stunde: 2

2: Lebensmittelstand fuer Suessware (Zuckerstange):
Preis pro 100g: 2.05 Euro
Verkaeufer: Mattis
Besucher pro Stunde: 12

3: Weihnachtsartikelstand:
Verkaeufer: Per
Besucher pro Stunde: 33

4: Lebensmittelstand fuer Suessware (Waffeln):
Preis pro 100g: 2.27 Euro
Verkaeufer: Fynn
Besucher pro Stunde: 50

Welchen Stand moechten Sie besuchen?
2
Guten Tag!
Wie viel Gramm moechten Sie?
20
20 Gramm fuer Sie. Lassen Sie es sich schmecken!
Darf es sonst noch etwas sein?
true
Wie viel Gramm moechten Sie?
30
30 Gramm fuer Sie. Lassen Sie es sich schmecken!
Darf es sonst noch etwas sein?
false
1.025 Euro, bitte.
Stand 1 wurde verschoben und wird jetzt von 2 Passanten pro Stunde besucht.
Stand 2 wurde verschoben und wird jetzt von 2 Passanten pro Stunde besucht.
Moechten Sie den Weihnachtsmarkt verlassen?
false
Der Weihnachtsmarkt besteht aus folgenden Staenden:

0: Lebensmittelstand fuer Flammkuchen:
Preis pro 100g: 0.91 Euro
Verkaeufer: Sarah
Besucher pro Stunde: 21

1: Weihnachtsartikelstand:
Verkaeufer: Felix
Besucher pro Stunde: 2


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
2: Lebensmittelstand fuer Suessware (Zuckerstange):
Preis pro 100g: 2.05 Euro
Verkaeufer: Mattis
Besucher pro Stunde: 2

3: Weihnachtsartikelstand:
Verkaeufer: Per
Besucher pro Stunde: 33

4: Lebensmittelstand fuer Suessware (Waffeln):
Preis pro 100g: 2.27 Euro
Verkaeufer: Fynn
Besucher pro Stunde: 50

Welchen Stand moechten Sie besuchen?
3
Guten Tag!
Unsere Artikel sind:
0: Armband (4.87 Euro)
1: Rucksack (6.45 Euro)
2: Tasse (7.48 Euro)
3: Teelichtkarussel (8.85 Euro)
4: Uhr (4.03 Euro)
5: Kette (5.12 Euro)
6: Fensterbild (2.94 Euro)
7: Stofftier (0.88 Euro)
8: ausverkauft
Welchen Artikel moechten Sie kaufen?
2
Tasse wird eingepackt. Viel Spass damit!
Darf es sonst noch etwas sein?
true
Unsere Artikel sind:
0: Armband (4.87 Euro)
1: Rucksack (6.45 Euro)
2: ausverkauft
3: Teelichtkarussel (8.85 Euro)
4: Uhr (4.03 Euro)
5: Kette (5.12 Euro)
6: Fensterbild (2.94 Euro)
7: Stofftier (0.88 Euro)
8: ausverkauft
Welchen Artikel moechten Sie kaufen?
4
Uhr wird eingepackt. Viel Spass damit!
Darf es sonst noch etwas sein?
false
11.510000000000002 Euro, bitte.
Stand 1 wurde verschoben und wird jetzt von 3 Passanten pro Stunde besucht.
Dabei ist Artikel 2: Kette (9.18 Euro) leider vom Stand gefallen und kaputt gegangen.
Stand 2 wurde verschoben und wird jetzt von 90 Passanten pro Stunde besucht.
Moechten Sie den Weihnachtsmarkt verlassen?
true

```
Hinweise:
```
- BerücksichtigenSieindergesamtenAufgab ediePrinzipienderDatenkapselungundverwendenSie
  ImplementierungeninOb erklassenbzw.Interfacessoweitmöglich.
- VermeidenSieb etriebssystemsp ezischeZeilenseparatorenwie\nbzw.\r\ninStrings.Verwenden
  SiestattdessenSystem.lineSeparator().


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
# Aufgab e 3 (Klassenhierarchie): (10Punkte)

IndieserAufgab esollderZusammenhangverschiedenerGetränkezueinanderineinerKlassenhierarchiemo-
delliertwerden.Dab eisollenfolgendeFaktenb eachtetwerden:

- JedesGetränkhateinb estimmtesVolumen.
- WirwollenApfelsaftundKiwisaftb etrachten.Apfelsaftkannklaro dertrübsein.
- AlleSaftartenkönnenauchFruchteischenthalten.
- Wo dkaundTequilasindzweiSpirituosen.Spirituosenhab eneinenb estimmtenAlkoholgehalt.
- Wo dkawirdhäugaromatisierthergestellt.DerNamediesesAromassollgesp eichertwerdenkönnen.
- Tequilagibtesalssilb ernenundalsgoldenenTequila.
- EinMischgetränkisteinGetränk,dasausverschiedenenanderenGetränkenb esteht.
- MischgetränkeundSäftekannmanschütteln,damitdieEinzelteile(bzw.dasFruchteisch)sichgleich-
  mäÿigverteilen.SiesollendahereineMetho deschuetteln()ohneRückgab ezurVerfügungstellen.
- InunsererMo dellierunggibteskeineweiterenGetränke.

EntwerfenSieunterBerücksichtigungderPrinzipienderDatenkapselungeinegeeigneteKlassenhierarchiefür
dieGetränke.NotierenSiekeineKonstruktoren,GetterundSetter.Siemüssennichtmarkieren,obAttribute
finalseinsollen.AchtenSiedarauf,dassgemeinsameMerkmaleinOb erklassenbzw.Interfaceszusammen-
gefasstwerden.
VerwendenSiehierb eidiefolgendeNotation:

```
abstract AbstrakteKlasse
```
- int intAttribut
- long longAttribut

```
+ String export()
```
- long computeSomething()
+ void doSomething(int)

```
interface Interface
+ int someFunction(long)
```
```
Klasse
```
- WirdVerwendet verwendet

```
WirdVerwendet
+ int anotherFunction()
```
EineKlassewirdhierdurcheinenKastenb eschrieb en,indemderNamederKlassesowieAttributeund
Metho denineinzelnenAbschnittenb eschrieb enwerden.Weiterhinb edeutetderPfeilB A,dassAdie
Ob erklassevonBist(alsoclass B extends Abzw.class B implements A,fallsAeinInterfaceist)und
A B,dassAdenTypBverwendet(z.B.alsTypeinesAttributso derinderSignatureinerMetho de).
Benutzensie+und-umpublicundprivateabzukürzen.
TragenSiekeinevordeniertenKlassen(String,etc.)o derPfeiledorthininihrDiagrammein.

# Aufgab e 4 (Programmierung): (3.5+0.5+ 2 + 9 + 2 +5.5+5.5+ 6 + 6 = 40

# Punkte)

EinArraybietetdieMöglichkeit,einerb egrenztenAnzahlnatürlicherZahleneinenWertzuzuordnen.Als
Schlüsselkönnenb eiArraysalsonurnatürlicheZahlengenutztwerden.Oftistesjedo chhilfreich,alsSchlüssel
WerteeinesanderenTypszunutzen.EinesolcheDatenstrukturnenntsichMap.
Beispielsweisekannin einerMapmitdemSchlüssel-TypStringunddemWert-TypIntegerb eliebigen
StringsjeeinInteger-Wertzugeordnetwerden.


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
IndieserAufgab ewollenwireinesolcheMap-DatenstrukturinJavaimplementieren,welcheesunsauÿerdem
erlaubtzukontrollieren,obnurlesendo derauchschreib endaufdieMapzugegrienwerdenkann.
Hinweise:

- (Picht)NutzenSieangeeignetenStellenMo diziererwiestatic,private,protectedundpublic.
- (Picht)WenneinTypTypparametererwartet,sonutzenSieihnnichtohneTypparameter.
- (Optional)NutzenSieangeeignetenStellenMo diziererwie@Overrideundfinal.

```
a)ZunächsterstellenwireineKlasse,umeinzelneZuordnungenvonSchlüsselnzuWertensp eichernzu
können.
ErstellenSiedieKlasseEntry,welchezweigenerischeTypparametererhält.DerersteTypparameter,K,
stelltdenTypderSchlüsseldar,derzweite,V,denTypderWerte.
DieKlassesolleinK-Attributkeyhab enundeinV-Attributvalue.DieKlassesollüb ereinenKonstruktor
verfügen,welcherdieb eidenAttributeentsprechendinitialisiert.DieKlassesollauÿerdemfürb eide
AttributeeinenGetterzurVerfügungstellen.
b)ErstellenSiedieKlasseUnknownKeyException,welchevonExceptionerbt.
```
```
c)NunerstellenwireinInterface,umlesendaufeineMapzugreifenzukönnen.
ErstellenSiedasInterfaceReadableMap,welcheseb enfallsdieb eidengenerischenTypparameterKund
VfürdenTypderSchlüsselunddenTypderWerteerhält.
DasInterfacehateineMetho degetOrThrow,dieeinenK-ParameterkeyerhältundeinenV-Wertzurück-
gibt.AuÿerdemsollenMetho den,diegetOrThrowimplementieren,eineUnknownKeyExceptionwerfen,
fallsdemüb ergeb enenSchlüsselkeinWertzugeordnetist.
```
```
d)NunerstellenwireineabstrakteKlasse,welcheeinArrayvonSchlüssel-Wert-Zuordnungenhältund
darauflesendenZugrigewährt.DieseKlasseistnurdeswegenabstrakt,davonihrkeineOb jekteerzeugt
werdensollen.WirimplementierenanschlieÿendzweiUnterklassen,vondenentatsächlichOb jekteerstellt
werdenkönnen.
ErstellenSiedieabstrakteKlasseAbstractReadableMap,welcheeb enfallsdieb eidengenerischenTyppa-
rameter K und V für den Typ der Schlüssel und den Typ der Werte erhält und das Interface
ReadableMap<K, V>implementiert.
DieKlassesolleinAttributentriesvomTypEntry<K, V>[]hab en.DiesesAttributwirddurcheinen
Konstruktorinitialisiert,welchereinenParametervomTypEntry<K, V>[]erhält,diesesArraykopiert
unddaskopierteArraydemAttributzuweist.DasArraywirddeshalbeinmalkopiert,damitdieseKlasse
dieeinzigeist,welcheeineReferenzaufdasArrayhält,welchesinihremAttributgesp eichertist.Soist
ausgeschlossen,dassdasArrayimAttributvonauÿengeändertwerdenkann.Auÿerdemsolleinweiterer
KonstruktorohneParameterimplementiertwerden,welcherdasAttributmiteinemArrayderLänge 10
initialisiert.
Hinweise:
```
- (Info)Leideristesnichtsoeinfach,mitArrayseinesgenerischenTypszuarb eiten.Daherhab en
  wirdieKlasseGenericArrayHelperimMo o dle-LernraumzurVerfügunggestellt,umdiesfürSie
  zuvereinfachen.
- (Picht)NutzenSiedieMetho de<T> T[] copyArray(T[] array)derKlasseGenericArrayHelper,
  umdasüb ergeb eneArrayzukopieren.Daszurückgegeb eneArrayistalsogleichgroÿwiedasüb er-
  geb eneArrayundhatdieselb enEinträge,wurdejedo chneuangelegt.
- (Picht)NutzenSiedieMetho de<K, V> Entry<K, V>[] newEntryArrayOfSize(int size)der
  KlasseGenericArrayHelper,umeinArrayderLängesizemitEinträgenvomTypEntry<K, V>
  anzulegen.
  ImplementierenSiedieMetho degetOrThrowdesInterfacesReadableMap.LaufenSiedazumiteiner
  foreach-Schleifeüb erdasAttributentries.FallsSiedab eieinenArrayeintragnden,welchernicht
  nullistunddessenSchlüsseldemParameterkeyentspricht,sogeb enSiedenWertdiesesArrayeintrags
  zurück.FallsSiekeinensolchenArrayeintragnden,sowerfenSieeineUnknownKeyException.
  Hinweise:


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
- (Picht)NutzenSiedieMetho deequals,umSchlüsselmiteinanderzuvergleichen.

```
e)NunerstellenwireinInterface,umschreib endaufeineMapzugreifenzukönnen.
ErstellenSiedasInterfaceWritableMap,welcheseb enfallsdieb eidengenerischenTypparameterKund
Vfürden TypderSchlüsselunddenTypderWerteerhält.DiesesInterfaceerweitertdasInterface
ReadableMap<K, V>,dab eischreib endemZugriauchautomatischeinlesenderZugrimöglichsein
soll.
DasInterfacehatdieMetho deput,welcheeinenK-ParameterkeyundeinenV-Parametervalueerhält
undnichtszurückgibt.
```
```
f )WirerstellennuneineKlasse,welchelesendenundschreib endenZugriaufeineMapbietet.
ErstellenSiedieKlasseMutableMap,welcheeb enfallsdieb eidengenerischenTypparameterKundVfür
den Typ der Schlüssel und den Typ der Werte erhält und welche eine Unterklasse von
AbstractReadableMap<K, V>istunddasInterfaceWritableMap<K, V>implementiert.
ImplementierenSiedieMetho deputdesInterfacesWritableMap.LaufenSiedazumiteinerfor-Schleife
üb erdasAttributentriesderKlasseAbstractReadableMap.DamitSieaufdiesesAttributauseiner
Subklassezugreifenkönnen,solltediesesalsprotecteddeklariertwerden.
Hinweise:
```
- (Picht)NutzenSiedieMetho deequals,umSchlüsselmiteinanderzuvergleichen.
  FallsSieeinenArrayeintragnden,welchernullisto derdessenSchlüsseldemParameterkeyentspricht,
  soüb erschreib enSiediesenArrayeintragmiteinemneuerstelltenEntry-Ob jekt,welchesdenParameter
  keyalsSchlüsselenthältunddenParametervaluealsWertundb eendenSieanschlieÿenddieAusführung
  derMetho demitfolgenderAnweisung:
  return;
  FallsSiekeinensolchenArrayeintragnden,sob enötigenwireingröÿeresArray.ErstellenSiedazuein
  Arraydopp elterGröÿe,kopierenSiediebisherigenArrayeinträgeindasneueArrayundweisenSiedieses
  neueArraydemAttributentriesderKlasseAbstractReadableMapzu.FügenSieanschlieÿendander
  erstenfreienStelleimneuenArrayeinneuesEntry-Ob jektein,welchesdenParameterkeyalsSchlüssel
  unddenParametervaluealsWertenthält.
  Hinweise:
- (Info)WieinTeild)erwähnt,istesleidernichtsoeinfach,mitArrayseinesgenerischenTypszu
  arb eiten.Daherhab enwirdieKlasseGenericArrayHelperimMo o dle-LernraumzurVerfügung
  gestellt,umdiesfürSiezuvereinfachen.
- (Picht)NutzenSiedieMetho de<T> T[] copyArrayWithIncreasedSize(T[] array, int newSize)
  derKlasseGenericArrayHelper,umeinneuesArrayderLängenewSizemitEinträgenvomTypT
  zuerstellenundalleEinträgeausdemParameterarrayindasneueArrayzukopieren.DieMetho de
  gibtdasneueArrayzurück.

g)Bisherhab enwireinInterfacefürdenlesendenZugrierstelltundeinsfürdenschreib endenZugri.
Esistalsob ereitsmöglich,einerMetho de,welchenurlesendenZugrib enötigt,nurlesendenZugrizu
gestatten.Sokönnenwirsichersein,dassdieseMetho dekeineZuordnungeninderMapändert.Esist
ab erweiterhinmöglich,dasssichZuordnungenineinerMapvomTypReadableMapändern,b eispielweise,
wenndasOb jekttatsächlichvomTypMutableMapistundaneineranderenStelleno cheineReferenz
vomTypWritableMapaufdasselb eOb jektb esteht.EineReferenzvomTypReadableMapverhindert
alsonur,dassdieseeineReferenzZuordnungeninderMapändert.Diesistoftpraktisch,jedo chist
esmanchmalnotwendig,Änderungenvollständigauszuschlieÿen.DahererstellenwirnuneineKlasse,
welchediesermöglicht.
ErstellenSiedieKlasseImmutableMap,welcheeb enfallsdieb eidengenerischenTypparameterKundVfür
den Typ der Schlüssel und den Typ der Werte erhält und welche eine Unterklasse von
AbstractReadableMap<K, V>ist.
DieKlassehateinenKonstruktor,welchereinenParametervomTypEntry<K, V>[]erhältunddiesen
andensuper-Konstruktorüb ergibt.


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
```
MarkierenSiedieseKlassealsfinal,indemSievordasSchlüsselwortclassdasSchlüsselwortfinal
schreib en.Diesführtdazu,dasskeineandereKlassedieseKlassealsihreOb erklassedenierenkann.
WennwirnuneinenWertvomTypImmutableMaphab en,sowissenwir,dassestatsächlicheinOb-
jektvomTypImmutableMapistundnichtvoneinemUntertyp,denneskannkeineUntertyp envon
ImmutableMap geb en. Da nun ab er ImmutableMap keine Möglichkeit bietet, die
Schlüssel-Wert-Zuordnungenzuändern,istklar,dassdieseZuordnungensichnachdemErstellendes
ImmutableMap-Ob jektsnichtmehrändernkönnen.DieZuordnungenkönnenalsonureinmaligb eim
AufrufdesKonstruktorsfestgelegtwerden.
ErstellenSieindemInterfaceReadableMapdieMetho deasImmutableMap,welchekeineParametererhält
undeinenWertvomTypImmutableMap<K, V>zurückgibt.
Implementieren Sie die Metho de asImmutableMap aus dem Interface ReadableMapin der Klasse
AbstractReadableMap.RufenSiedazudenKonstruktorvonImmutableMapauf,üb ergeb enSiedasAt-
tributentriesundgeb enSiedassoerstellteImmutableMap-Ob jektzurück.
```
h)BeieinemArrayistklar,welcheIndizesesgibt,sobaldmandieGröÿekennt.BeieinerMapistjedo ch
zunächstunklar,welchenSchlüsselneinWertzugeordnetist.DahererstellenwirnuneineMetho de,um
dieSchlüsseleinerMapauszulesen.
ErstellenSieindemInterfaceReadableMapdieMetho dekeysAsSet,welchekeineParametererhältund
einenWertvomTypSet<K>zurückgibt.
Implementieren Sie die Metho de keysAsSet aus dem Interface ReadableMap in der Klasse
AbstractReadableMap.ErstellenSiedazueinneuesHashSetundfügenSiedortalleSchlüsselder
aktuellenMapein,etwaindemSiemiteinerforeach-Schleifeüb erdasentries-Attributlaufenund
dieSchlüsselallernicht-leerenArrayeinträgeimHashSetablegen.Geb enSieanschlieÿenddaserstellte
HashSetzurück.
Hinweise:

- In dieser Aufgab e nutzen wir die von Java vorgegeb enen Typ en java.util.Set und
  java.util.HashSet.Dab eiistSet<T>einInterface,welchesvonderKlasseHashSet<T>imple-
  mentiertwird.DieKlasseHashSet<T>b esitzteinenparameterlosenKonstruktorzurErzeugung
  einesneuenleerenHashSet-Ob jekts.InSet<T>existiertdieMetho deadd(T t),welchedenWert
  tindasaktuelleSeteinfügt.

```
i)NunwollenwirunsereMapnutzen.
ErstellenSiedieKlasseLaunchermiteinermain-Metho deundzweiweiterenMetho den.
DieMetho deputEntrieserhälteinenParametervomTypWritableMap<String, Integer>undruft
daraufdreimaldieMetho deputauf,umfolgendeZuordnungenzuerstellen:
```
- DemString-Wert"sizeInMB"sollderInteger-Wert 42 zugeordnetwerden.
- DemString-Wert"version"sollderInteger-Wert 4 zugeordnetwerden.
- DemString-Wert"yearOfRelease"sollderInteger-Wert 2015 zugeordnetwerden.
  DieMetho deprintEntrieserhälteinenParametervomTypReadableMap<String, Integer>undgibt
  alleSchlüssel-Wert-Zuordnungenderüb ergeb enenMapaus.DazuwirdzunächstdieMetho dekeysAsSet
  aufderüb ergeb enenMapaufgerufenundüb erdenRückgab ewertmiteinerforeach-Schleifegelaufen.
  InderSchleifewirddieMetho degetOrThrowmitjedemgefundenenSchlüsselkeyaufderüb ergeb enen
  Mapaufgerufen,umdenInteger-Wertvaluezuerhalten,welcherdemSchlüsselzugeordnetist.Diese
  Schlüssel-Wert-ZuordnungwirdinfolgenderFormaufderKonsoleausgegeb en:
  key: value
  ObwohlwireindeutignurfürexistierendeSchlüsseldieMetho degetOrThrowaufrufen,müssenwireine
  Fehlerb ehandlungdurchführen,denndieMetho degetOrThrowistmitthrows UnknownKeyException
  deklariert.ErstellenSieeinentry-catch-Blo ck,umdiesenFehlerzufangen.Geb enSieimcatch-Blo ck
  eineNachrichtaufderKonsoleaus,welcheb eschreibt,dassdieserFehleraufgetretenist.
  Die main-Metho de arb eitet wie folgt. Zunächst wird einer Variable map vom Typ
  MutableMap<String, Integer>einneuesMutableMap-Ob jektzugewiesen.


```
Übungsblatt 7 (Abgab ebisMittwo ch,den13.01.2021,um12:00Uhr)
```
```
AnschlieÿendwirddieMetho deputEntriesmitmapalsParameteraufgerufen.DaderParameterder
Metho deputEntriesvomTypWritableMapist,fordertdieseMetho deschreib endenZugriaufdiemap
underhältdiesenauch,denneineMutableMapistauchimmereineWritableMap.
AnschlieÿendwirddieMetho deprintEntriesmitmapalsParameteraufgerufen.DaderParameterder
Metho deprintEntriesvomTypReadableMapist,fordertdieseMetho denurlesendenZugriaufdie
mapunderhältdiesenauch,denneineMutableMapistauchimmereineReadableMap.
NunwirdausdermapeineImmutableMapmitdenselb enEinträgenerzeugt.DazuwirdaufmapdieMetho-
de asImmutableMap aufgerufen und das Ergebnis in einer Variable immutableMap vom Typ
ImmutableMap<String, Integer>abgelegt.
AnschlieÿendwirddieMetho deprintEntriesmitimmutableMapalsParameteraufgerufen.Dader
ParameterderMetho deprintEntriesvomTypReadableMapist,fordertdieseMetho denurlesenden
ZugriaufdieimmutableMapunderhältdiesenauch,denneineImmutableMapistauchimmereine
ReadableMap.
Esistjedo chnichtmöglich,dieMetho deputEntriesmitimmutableMapalsParameteraufzurufen.Da
derParameterderMetho deputEntriesvomTypWritableMapist,fordertdieseMetho deschreib en-
denZugriaufdieimmutableMap.Diesistjedo chnichtmöglich,denneineImmutableMapkannnicht
gleichzeitigeineWritableMapsein.
Diemain-Metho desollteFolgendesausgeb en,wob eidieReihenfolgederZeilenabweichendseinkann:
y e a r O f R e l e a s e : 2 0 1 5
s i z e I n M B : 4 2
v e r s i o n : 4
y e a r O f R e l e a s e : 2 0 1 5
s i z e I n M B : 4 2
v e r s i o n : 4
```
```
Hinweise:
```
- (Info)HiersehenwirdenGrund,warumesüb erhauptHüllklassenwieIntegerundLongfürdie
  primitivenTyp enintundlonggibt.DerGrundist,dassanmanchenStellenDatentyp enverwendet
  werdenmüssen,dienichtprimitivsind.BeispielsweisekönnenprimitiveTyp ennichtalsgenerische
  Typparametergenutztwerden.Eb ensokannmankeinenWerteinesprimitivenTypsanStellen
  verwenden,woeinOb jektvomTypObjecterwartetwird.AnstellederprimitivenTyp enmusshier
  alsoimmerdieHüllklassegenutztwerden.

# Aufgab e 5 (Deck7): (Co descap e)

SchlieÿenSiedasSpielCodescapeab,indemSiedieletztenMissionenvonDeck 7 lösen.GenieÿenSieanschlie-
ÿenddasOutro.DiesesDeckenthältkeinefürdieZulassungrelevantenMissionen.

```
Hinweise:
```
- EsgibtdreiverschiedeneMöglichkeitenwiedieStoryendet,abhängigvonIhrerEntscheidungimnalen
  Raum.
- VerratenSieIhrenKommilitonennicht,welcheAuswirkungenIhreEntscheidunghatte,b evordieseselbst
  dasSpielabgeschlossenhab en.


