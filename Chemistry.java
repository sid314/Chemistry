public class Chemistry {
  static String[] compounds = { "cyclic hemiacetal alpha d fructose ring structure",
      "cyclic hemiacetal beta d fructose ring structure", "oxirane",
      "oxitane", "oxalane", "THP", "oxane", "THF", "thiane", "piperidine", "pyridine", "furan", "pyruvic acid",
      "lactic acid", "oxalic acid",
      "mallonic acid", "succinic acid", "gluteric acid", "adipic acid", "tartaric acid", "maleic acid", "fumeric acid",
      "ketopinic acid",
      "gluconic acid", "glcaric acid", "sachharic acid", "toluene", "benzoic acid", "nitrobenzene", "oil of mirbane",
      "ortho xylene",
      "meta xylene", "para xylene", "phthalic acid", "phenol", "benzene sulphonic acid", "ethyl benzene", "aniline",
      "chlorobenzene", "benzaldehyde",
      "styrene", "vinyl benzene", "cyclo propyl benzene", "formaldehyde", "acetic acid", "caproic acid", "acetaldehyde",
      "isobutyric acid",
      "DMF", "DMA", "acryldehyde", "cinnamyldehyde", "crotonyldehyde", "tolsyl", "ortho cresol", "meta cresol",
      "para cresol", "quinol", "catechol",
      "resorcinol", "phenetol", "pyrolidene", "pyrol", "thiophane", "acetyl", "phenyl", "acry", "allyl", "cinnamyl",
      "crotonyl", "benzyl", "benzol",
      "benzal", "ortho phenylene", "meta phenylene", "para phenylene", "triptane", "isooctane", "ethylene glycol",
      "picric acid", "squaric acid",
      "ascorbic acid", "barbituric acid", "citric acid", "cinnamic acid", "salicylic acid", "aspirin",
      "isophthalic acid", "terphthalic acid",
      "mendalic acid", "cytosine", "thymine", "uracil", "adenine", "guanine", "HMPA", "hexa methyl phosphor amide",
      "DMSO", "dimethyl sulphoxide",
      "glyoxal", "propargyl", "Caro's acid", "Marshall's Acid", "cholral", "gammaxene", "freon 12", "chloropicrin",
      "caprolactum", "vanillin", "salicyldehyde",
      "mesityl oxide", "sachharin", "glucitol", "sorbitol", "glycolic acid", "trihydroxy gluteric acid",
      "methyl salicylate", "oil of winter green",
      "Rochelle's salt", "Hinsberg reagent", "salol", "2,4 DNP", "Brady's reagent", "acetophenone", "glycerol",
      "d glucose fischer projection", "d mannose fischer projection", "d galactose fischer projection",
      "alpha d glucose fischer projection", "beta d glucose fischer projection", "alpha d glucose chair form",
      "beta d glucose chair form", "mesityl oxide", "mesitylene",
      "quinoline", "cyclic hemiacetal alpha d glucose ring structure",
      "cyclic hemiacetal beta d glucose ring structure", "beta d glucose chair form",
      "fructose fischer projection", "glycine", "alanine", "phenylalanine", "valine", "leucine", "isoleucine",
      "argeine", "lysine", "glutamic acid", "apsartic acid",
      "glutamine", "asperginine", "threomine", "serine", "cysteine", "methiomine", "tyrosine", "tryptophan",
      "histidine" };

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++)
      System.out.println(compounds[(int) (Math.random() * compounds.length)]);
  }
}
