package lintcode.q1676;

import java.util.LinkedList;

import static java.util.Arrays.*;

public class Q1676 {
    public static void main(String[] args) {
        //4
        System.out.println(new Solution().getDistance(5,2,25, new LinkedList<Integer>(asList(2, 11, 14, 17, 21))));
        //238356
        System.out.println(new Solution().getDistance(100,40,53428902, new LinkedList<Integer>(asList(137872,312786,640276,718243,995859,1188568,1229359,1549474,1843642,1931010,2242465,2430010,2549796,2902294,3396266,3521509,3961579,4297275,4613587,4614842,5074008,5094591,5327198,5860009,5945922,6341191,6655012,6816932,7084191,7109821,7640178,7936610,8026301,8054873,8545942,8989726,9224735,9244360,9331817,9406546,9898145,10239978,10764311,10962958,10972250,11128108,11319843,11515655,11818594,12283648,12403800,12631814,12885894,13202229,13229659,13362406,13446983,13639755,13783223,14210368,14292516,14787853,14808906,15269292,15393700,15607344,15858474,16279493,16281697,16551566,16646986,17129598,17270469,17599294,18119162,18371807,18492487,18611563,18843930,18927526,19164215,19465972,19637549,19973483,20262894,20600381,20736572,21174736,21475457,21824861,21986321,22213204,22705607,22708998,23140278,23212977,23378634,23677390,23708887,23728739))));
    }
}
