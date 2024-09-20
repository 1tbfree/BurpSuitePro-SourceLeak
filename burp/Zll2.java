package burp;

import java.util.HashMap;
import java.util.Map;

class Zll2 {
  private static Map<Integer, Double>[] ZV = (Map<Integer, Double>[])new HashMap[Zgpg.Zf.length];
  
  private static final double[][] ZL = new double[][] { 
      { 
        2.0D, 3.5552684E-6D, 0.003566815D, 0.09185742D, 0.44089565D, 0.94931304D, 0.61565757D, 0.33250064D, 0.171934D, 0.08694298D, 
        0.043471396D, 0.021612251D, 0.0107137235D, 0.0053030984D, 0.002622811D, 0.0012965817D, 6.4076774E-4D, 3.1659513E-4D, 1.5639655E-4D, 7.724615E-5D, 
        3.8146612E-5D, 1.883498E-5D, 9.298304E-6D, 4.5895526E-6D, 2.2649751E-6D, 1.1175867E-6D }, { 
        3.0D, 5.615756E-6D, 0.0038395983D, 0.09128372D, 0.4332959D, 0.93597674D, 0.62861437D, 0.34209523D, 0.17813182D, 0.09066553D, 
        0.045617145D, 0.022818753D, 0.011381243D, 0.0056682657D, 0.0028208955D, 0.0014033187D, 6.9796847E-4D, 3.471075E-4D, 1.7260764E-4D, 8.5828855E-5D, 
        4.2676475E-5D, 2.121914E-5D, 1.0549995E-5D, 5.245202E-6D, 2.6077016E-6D, 1.2964006E-6D }, { 
        4.0D, 1.6049347E-4D, 0.018899525D, 0.19776967D, 0.63282925D, 0.8721444D, 0.49641743D, 0.264974D, 0.13672127D, 0.069330774D, 
        0.034850124D, 0.017440869D, 0.008709077D, 0.004344047D, 0.002165579D, 0.0010792691D, 5.3780025E-4D, 2.6796458E-4D, 1.3350997E-4D, 6.6517685E-5D, 
        3.313991E-5D, 1.651042E-5D, 8.225424E-6D, 4.0978152E-6D, 2.041458E-6D, 1.017004E-6D }, { 
        4.0D, 6.708554E-6D, 0.003912987D, 0.09026821D, 0.42786628D, 0.92757154D, 0.6363749D, 0.34767672D, 0.18166608D, 0.09275667D, 
        0.04680828D, 0.023482028D, 0.011745252D, 0.0058660368D, 0.0029275485D, 0.0014604969D, 7.284748E-4D, 3.63317E-4D, 1.8118993E-4D, 9.0358604E-5D, 
        4.5060606E-5D, 2.2470826E-5D, 1.1205642E-5D, 5.5879277E-6D, 2.786515E-6D, 1.3895328E-6D }, { 
        5.0D, 8.1015105E-4D, 0.041201208D, 0.28928745D, 0.76285386D, 0.7633047D, 0.4264373D, 0.22552676D, 0.11589833D, 0.058693673D, 
        0.02950478D, 0.014776798D, 0.007386866D, 0.0036892272D, 0.0018416521D, 9.191312E-4D, 4.5866484E-4D, 2.2886877E-4D, 1.1419925E-4D, 5.698123E-5D, 
        2.8431214E-5D, 1.4185855E-5D, 7.0780393E-6D, 3.531572E-6D, 1.7620615E-6D }, { 
        5.0D, 1.6773494E-4D, 0.01880551D, 0.195592D, 0.6273866D, 0.87841964D, 0.5014436D, 0.26832947D, 0.1387592D, 0.07050674D, 
        0.035509177D, 0.017803721D, 0.008906535D, 0.0044506155D, 0.0022227345D, 0.0011097695D, 5.540082E-4D, 2.7654646E-4D, 1.380396E-4D, 6.890178E-5D, 
        3.4391585E-5D, 1.7166065E-5D, 8.5681495E-6D, 4.2766287E-6D, 2.1345902E-6D, 1.0654328E-6D }, { 
        5.0D, 3.4728106E-5D, 0.008583417D, 0.13224298D, 0.5159756D, 0.9828193D, 0.5728746D, 0.31009972D, 0.16134268D, 0.08224792D, 
        0.041495282D, 0.020826029D, 0.010425045D, 0.0052117137D, 0.0026037444D, 0.0013003894D, 6.493469E-4D, 3.2422302E-4D, 1.6187967E-4D, 8.082227E-5D, 
        4.0351937E-5D, 2.0146268E-5D, 1.0058258E-5D, 5.021685E-6D, 2.5071188E-6D, 1.2516972E-6D }, { 
        5.0D, 7.1901613E-6D, 0.003917738D, 0.08941165D, 0.4243489D, 0.9224988D, 0.6409008D, 0.3508624D, 0.18365215D, 0.09391766D, 
        0.047463145D, 0.02384373D, 0.011942398D, 0.0059725214D, 0.0029846814D, 0.0014909913D, 7.4468117E-4D, 3.7189844E-4D, 1.8571946E-4D, 9.274268E-5D, 
        4.6312274E-5D, 2.312647E-5D, 1.1548366E-5D, 5.766741E-6D, 2.8796474E-6D, 1.4379615E-6D }, { 
        5.0D, 1.4886623E-6D, 0.001788177D, 0.060452692D, 0.34899324D, 0.83663017D, 0.70568436D, 0.39064184D, 0.20569092D, 0.10551638D, 
        0.05341282D, 0.026856828D, 0.013458592D, 0.006733039D, 0.003365546D, 0.001681575D, 8.400108E-4D, 4.1957272E-4D, 2.0955896E-4D, 1.0466302E-4D, 
        5.227259E-5D, 2.6106663E-5D, 1.3038473E-5D, 6.511797E-6D, 3.2521757E-6D, 1.6242259E-6D }, { 
        6.0D, 8.161794E-4D, 0.04087306D, 0.2870192D, 0.75875443D, 0.76737994D, 0.42946175D, 0.22746229D, 0.11704453D, 0.05934437D, 
        0.029865332D, 0.014973631D, 0.0074932664D, 0.003746338D, 0.0018721404D, 9.3533593E-4D, 4.6724587E-4D, 2.3339818E-4D, 1.1658329E-4D, 5.823289E-5D, 
        2.9086856E-5D, 1.4528579E-5D, 7.2568523E-6D, 3.6247043E-6D, 1.8104903E-6D }, 
      { 
        6.0D, 1.6168186E-5D, 0.005774903D, 0.107989244D, 0.46552154D, 0.96554923D, 0.60995907D, 0.33242017D, 0.1736415D, 0.08873209D, 
        0.04483919D, 0.02253151D, 0.011290057D, 0.005649208D, 0.0028246953D, 0.0014118934D, 7.055946E-4D, 3.5259002E-4D, 1.7618357E-4D, 8.8034125E-5D, 
        4.3987744E-5D, 2.1979093E-5D, 1.0982126E-5D, 5.487345E-6D, 2.7418118E-6D, 1.369975E-6D }, { 
        7.0D, 8.159288E-4D, 0.040630303D, 0.2856132D, 0.7563444D, 0.7697124D, 0.43116313D, 0.2285373D, 0.11767479D, 0.059699237D, 
        0.030060612D, 0.015079612D, 0.0075502642D, 0.0037767962D, 0.0018883373D, 9.4391487E-4D, 4.7177475E-4D, 2.3578208E-4D, 1.1783491E-4D, 5.8888523E-5D, 
        2.9429577E-5D, 1.4707392E-5D, 7.349984E-6D, 3.6731328E-6D, 1.835636E-6D }, { 
        7.0D, 1.1528155E-4D, 0.0152869085D, 0.17523338D, 0.59246784D, 0.91110575D, 0.52405924D, 0.28178307D, 0.1461792D, 0.07444634D, 
        0.037561048D, 0.018861946D, 0.009449508D, 0.004728443D, 0.0023646676D, 0.0011822068D, 5.9095235E-4D, 2.9537882E-4D, 1.4763526E-4D, 7.378919E-5D, 
        3.6880036E-5D, 1.843265E-5D, 9.212622E-6D, 4.6044534E-6D, 2.3012967E-6D, 1.150183E-6D }, { 
        7.0D, 1.6287986E-5D, 0.0057516075D, 0.10751162D, 0.46409827D, 0.96375084D, 0.6114546D, 0.33342844D, 0.17425197D, 0.08908136D, 
        0.045032926D, 0.022637073D, 0.011346942D, 0.0056796363D, 0.0028408843D, 0.0014204702D, 7.1012287E-4D, 3.5497377E-4D, 1.7743515E-4D, 8.868975E-5D, 
        4.4330463E-5D, 2.2157905E-5D, 1.1075257E-5D, 5.5357737E-6D, 2.7669576E-6D, 1.3830136E-6D }, { 
        7.0D, 2.301309E-6D, 0.0021640079D, 0.06596202D, 0.36354247D, 0.8529898D, 0.693675D, 0.38352144D, 0.20189962D, 0.10360515D, 
        0.052476358D, 0.026405005D, 0.013242567D, 0.0066303764D, 0.0033169875D, 0.0016587053D, 8.292863E-4D, 4.1456695E-4D, 2.0723461E-4D, 1.0359019E-4D, 
        5.1780866E-5D, 2.588315E-5D, 1.2937891E-5D, 6.4670935E-6D, 3.2326182E-6D, 1.615844E-6D }, { 
        8.0D, 8.141949E-4D, 0.04046993D, 0.28477398D, 0.7549582D, 0.77102685D, 0.4321088D, 0.2291286D, 0.11801855D, 0.059891447D, 
        0.030165758D, 0.015136385D, 0.007580663D, 0.0037929772D, 0.001896912D, 9.484426E-4D, 4.7415835E-4D, 2.3703363E-4D, 1.1849053E-4D, 5.923124E-5D, 
        2.9608389E-5D, 1.4800524E-5D, 7.398413E-6D, 3.6982785E-6D, 1.8486744E-6D }, { 
        8.0D, 3.0633595E-4D, 0.024829673D, 0.22307222D, 0.66819304D, 0.84379846D, 0.4792357D, 0.25594527D, 0.1323224D, 0.0672783D, 
        0.033919346D, 0.017028399D, 0.008530497D, 0.0042688535D, 0.0021350903D, 0.0010675918D, 5.3374795E-4D, 2.6683218E-4D, 1.3339074E-4D, 6.668158E-5D, 
        3.333362E-5D, 1.6663154E-5D, 8.329732E-6D, 4.1639387E-6D, 2.0815048E-6D, 1.0405199E-6D }, { 
        8.0D, 1.1525706E-4D, 0.0152338445D, 0.17473933D, 0.5913996D, 0.912261D, 0.5249461D, 0.28235582D, 0.14651754D, 0.07463703D, 
        0.03766578D, 0.018918607D, 0.009479878D, 0.0047446163D, 0.0023732402D, 0.001186734D, 5.9333583E-4D, 2.966303E-4D, 1.4829086E-4D, 7.41319E-5D, 
        3.7058846E-5D, 1.8525783E-5D, 9.26105E-6D, 4.629599E-6D, 2.3143352E-6D, 1.1569351E-6D }, { 
        8.0D, 1.6315738E-5D, 0.0057343817D, 0.10722129D, 0.4632753D, 0.96273553D, 0.6122864D, 0.33398315D, 0.17458497D, 0.08927055D, 
        0.045137245D, 0.022693623D, 0.0113772815D, 0.0056958017D, 0.0028494548D, 0.0014249969D, 7.125062E-4D, 3.5622524E-4D, 1.7809075E-4D, 8.903246E-5D, 
        4.4509274E-5D, 2.2251035E-5D, 1.1123686E-5D, 5.5609194E-6D, 2.779996E-6D, 1.3897657E-6D }, { 
        8.0D, 2.3096484E-6D, 0.0021585578D, 0.06579174D, 0.36290863D, 0.8520975D, 0.69445515D, 0.38405874D, 0.20222738D, 0.103792846D, 
        0.052580263D, 0.026461445D, 0.013272876D, 0.0066465335D, 0.003325556D, 0.0016632314D, 8.316695E-4D, 4.158184E-4D, 2.078902E-4D, 1.039329E-4D, 
        5.1959672E-5D, 2.597628E-5D, 1.298632E-5D, 6.492239E-6D, 3.2456564E-6D, 1.6225961E-6D }, 
      { 
        9.0D, 8.125325E-4D, 0.040370278D, 0.28428596D, 0.75417405D, 0.7717585D, 0.4326292D, 0.2294512D, 0.118204765D, 0.059994943D, 
        0.030222086D, 0.0151666645D, 0.007596812D, 0.0038015435D, 0.0019014375D, 9.5082563E-4D, 4.7540973E-4D, 2.376892E-4D, 1.1883323E-4D, 5.9410046E-5D, 
        2.970152E-5D, 1.4848952E-5D, 7.4235586E-6D, 3.711317E-6D, 1.8554265E-6D }, { 
        9.0D, 3.0585658E-4D, 0.02477149D, 0.22269657D, 0.667504D, 0.8444846D, 0.4797398D, 0.25626275D, 0.13250715D, 0.06738139D, 
        0.033975564D, 0.017058648D, 0.008546637D, 0.0042774174D, 0.0021396151D, 0.0010699747D, 5.3499936E-4D, 2.6748775E-4D, 1.3373345E-4D, 6.686039E-5D, 
        3.342675E-5D, 1.6711583E-5D, 8.3548775E-6D, 4.176977E-6D, 2.088257E-6D, 1.0440124E-6D }, { 
        9.0D, 1.1513169E-4D, 0.015199961D, 0.17445028D, 0.59079415D, 0.91290456D, 0.5254343D, 0.2826683D, 0.14670083D, 0.07473972D, 
        0.037721887D, 0.018948827D, 0.009496011D, 0.0047531785D, 0.0023777646D, 0.0011891167D, 5.945871E-4D, 2.9728588E-4D, 1.4863355E-4D, 7.431071E-5D, 
        3.7151975E-5D, 1.8574212E-5D, 9.286196E-6D, 4.6426376E-6D, 2.3210873E-6D, 1.1604276E-6D }, { 
        9.0D, 1.631357E-5D, 0.0057229926D, 0.10705031D, 0.46280792D, 0.9621695D, 0.61274445D, 0.33428586D, 0.17476538D, 0.089372426D, 
        0.045193132D, 0.022723783D, 0.011393399D, 0.0057043596D, 0.0028539782D, 0.0014273793D, 7.137575E-4D, 3.5688077E-4D, 1.7843345E-4D, 8.9211266E-5D, 
        4.4602402E-5D, 2.2299464E-5D, 1.1148832E-5D, 5.573958E-6D, 2.786748E-6D, 1.3932581E-6D }, { 
        9.0D, 2.3115495E-6D, 0.0021547847D, 0.06569075D, 0.3625479D, 0.85159975D, 0.69488484D, 0.38435197D, 0.20240495D, 0.10389392D, 
        0.05263593D, 0.026491545D, 0.013288978D, 0.006655087D, 0.003330078D, 0.0016656135D, 8.3292066E-4D, 4.164739E-4D, 2.0823289E-4D, 1.0411171E-4D, 
        5.2052805E-5D, 2.6024709E-5D, 1.3011465E-5D, 6.5052777E-6D, 3.2524085E-6D, 1.6260885E-6D }, { 
        10.0D, 8.113059E-4D, 0.04031071D, 0.2840076D, 0.7537363D, 0.7721616D, 0.43291324D, 0.22962597D, 0.11830504D, 0.06005039D, 
        0.030252129D, 0.01518275D, 0.0076053618D, 0.0038060646D, 0.0019038194D, 9.5207675E-4D, 4.7606524E-4D, 2.3803189E-4D, 1.1901203E-4D, 5.9503178E-5D, 
        2.9749946E-5D, 1.4874097E-5D, 7.436597E-6D, 3.7180691E-6D, 1.858919E-6D }, { 
        10.0D, 3.0546772E-4D, 0.024736412D, 0.22248186D, 0.6671191D, 0.8448628D, 0.48001495D, 0.25643477D, 0.13260664D, 0.06743662D, 
        0.034005545D, 0.017074717D, 0.008555183D, 0.0042819376D, 0.0021419968D, 0.0010712257D, 5.3565484E-4D, 2.6783044E-4D, 1.3391225E-4D, 6.695352E-5D, 
        3.347518E-5D, 1.6736729E-5D, 8.367916E-6D, 4.1837293E-6D, 2.0917494E-6D, 1.0458168E-6D }, { 
        10.0D, 1.15012765E-4D, 0.015179343D, 0.17428468D, 0.59045565D, 0.91325927D, 0.52570087D, 0.28283763D, 0.14679953D, 0.07479473D, 
        0.037751812D, 0.018964881D, 0.009504552D, 0.004757697D, 0.002380146D, 0.0011903676D, 5.952426E-4D, 2.9762855E-4D, 1.4881237E-4D, 7.440384E-5D, 
        3.7200403E-5D, 1.8599356E-5D, 9.299234E-6D, 4.6493897E-6D, 2.3245798E-6D, 1.162232E-6D } };
  
  static Map<Integer, Double> ZD(int paramInt) {
    Zbqc[] arrayOfZbqc = Ze70.Zq();
    if (ZV[paramInt] == null) {
      ZV[paramInt] = new HashMap<>();
      int i = (int)ZL[paramInt][0];
      byte b = 1;
      while (b < (ZL[paramInt]).length) {
        ZV[paramInt].put(Integer.valueOf(i++), Double.valueOf(ZL[paramInt][b]));
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return ZV[paramInt];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zll2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */