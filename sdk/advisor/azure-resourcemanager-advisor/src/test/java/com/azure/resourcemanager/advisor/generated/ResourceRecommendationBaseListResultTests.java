// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner;
import com.azure.resourcemanager.advisor.models.Category;
import com.azure.resourcemanager.advisor.models.Impact;
import com.azure.resourcemanager.advisor.models.ResourceMetadata;
import com.azure.resourcemanager.advisor.models.ResourceRecommendationBaseListResult;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class ResourceRecommendationBaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceRecommendationBaseListResult model = BinaryData.fromString(
            "{\"nextLink\":\"ufubl\",\"value\":[{\"properties\":{\"category\":\"Cost\",\"impact\":\"Low\",\"impactedField\":\"aeqjhqjbasvms\",\"impactedValue\":\"qulngsntnbybkzgc\",\"lastUpdated\":\"2021-05-07T11:10:21Z\",\"metadata\":{\"jdous\":\"dataxxwr\",\"xbnjbiksq\":\"datacqvkocrcjdkwtn\",\"ainqpjwnzlljfm\":\"datagls\",\"vmgxsab\":\"datapee\"},\"recommendationTypeId\":\"qduujitcjczdz\",\"shortDescription\":{\"problem\":\"dhkrwpdappdsbdk\",\"solution\":\"rwjfe\"},\"suppressionIds\":[\"cf861f59-54b4-4f32-b15b-132581e90998\",\"f3591c80-7825-4739-94b5-5f29b359dfd1\",\"ffb90a62-3cb3-46ff-9461-f82e651957ff\",\"1e95b12a-cec3-4ebc-8283-7a88298f4953\"],\"extendedProperties\":{\"rl\":\"tjelt\",\"geablgphuticndvk\":\"hugjzzdatqxhoc\",\"ftyxolniw\":\"ozwyiftyhxhuro\",\"ryplwckbasyypn\":\"wcukjfkgiawxk\"},\"resourceMetadata\":{\"resourceId\":\"sgcbac\",\"source\":\"ejk\",\"action\":{\"wyqkgfgibm\":\"datanqgoulzndli\",\"qsrxybzqqed\":\"datadgak\",\"iqfouflmmnkz\":\"dataytb\",\"wtmutduq\":\"datamodmglougpb\"},\"singular\":\"ap\",\"plural\":\"wgcu\"},\"description\":\"tumkdosvqwhbm\",\"label\":\"bbjfddgmbmbexp\",\"learnMoreLink\":\"htqqrolfp\",\"potentialBenefits\":\"s\",\"actions\":[{\"gjyjgzjaoyfhrtxi\":\"dataqux\",\"rkujy\":\"datan\"},{\"juvf\":\"datal\",\"jkcpr\":\"dataawrlyx\",\"nruj\":\"datanwbxgjvtbvpyssz\"}],\"remediation\":{\"uitnwuiz\":\"datahmuouqfprwzwbn\",\"x\":\"dataa\",\"hr\":\"datafizuckyf\",\"zwdzuh\":\"dataidf\"},\"exposedMetadataProperties\":{\"wxmnteiwao\":\"datawisdkft\",\"fsrpymzidnse\":\"datavkmijcmmxdcuf\",\"yc\":\"datacxtbzsg\",\"mdwzjeiachboo\":\"datasne\"}},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"},{\"properties\":{\"category\":\"HighAvailability\",\"impact\":\"Low\",\"impactedField\":\"mnoh\",\"impactedValue\":\"ckwhds\",\"lastUpdated\":\"2021-07-22T01:38:16Z\",\"metadata\":{\"jxsqwpgrjbz\":\"datai\"},\"recommendationTypeId\":\"rcjxvsnbyxqabn\",\"shortDescription\":{\"problem\":\"pcyshu\",\"solution\":\"afbljjgpbtoqcjmk\"},\"suppressionIds\":[\"40f7c3ce-7323-4cfa-a559-713939d9530e\"],\"extendedProperties\":{\"pku\":\"qidtqajzyu\",\"gqexzlocxs\":\"jkrlkhbzhfepg\"},\"resourceMetadata\":{\"resourceId\":\"ierhhbcsglummaj\",\"source\":\"aodxo\",\"action\":{\"kajionpim\":\"datadxkqpx\",\"txgcpodgmaajr\":\"dataxg\",\"lwhijcoejctbzaq\":\"datavdjwzrlovm\"},\"singular\":\"sycbkbfk\",\"plural\":\"kdkexxp\"},\"description\":\"fmxa\",\"label\":\"fjpgddtocjjxhvp\",\"learnMoreLink\":\"uexhdzx\",\"potentialBenefits\":\"qeojnxqbzvddntw\",\"actions\":[{\"hcffcyddglmjthjq\":\"datacbtwnpzaoqvuh\",\"hix\":\"datawpyeicxmqciwqvh\",\"og\":\"dataigdtopbob\"}],\"remediation\":{\"a\":\"dataw\"},\"exposedMetadataProperties\":{\"iotkftutqxl\":\"datahrzayvvtpgvdf\",\"mi\":\"datagxlefgugnxkrxd\",\"abhjybi\":\"datatthzrvqd\"}},\"id\":\"ehoqfbowskan\",\"name\":\"ktzlcuiywg\",\"type\":\"ywgndrv\"}]}")
            .toObject(ResourceRecommendationBaseListResult.class);
        Assertions.assertEquals("ufubl", model.nextLink());
        Assertions.assertEquals(Category.COST, model.value().get(0).category());
        Assertions.assertEquals(Impact.LOW, model.value().get(0).impact());
        Assertions.assertEquals("aeqjhqjbasvms", model.value().get(0).impactedField());
        Assertions.assertEquals("qulngsntnbybkzgc", model.value().get(0).impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-07T11:10:21Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("qduujitcjczdz", model.value().get(0).recommendationTypeId());
        Assertions.assertEquals("dhkrwpdappdsbdk", model.value().get(0).shortDescription().problem());
        Assertions.assertEquals("rwjfe", model.value().get(0).shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("cf861f59-54b4-4f32-b15b-132581e90998"),
            model.value().get(0).suppressionIds().get(0));
        Assertions.assertEquals("tjelt", model.value().get(0).extendedProperties().get("rl"));
        Assertions.assertEquals("sgcbac", model.value().get(0).resourceMetadata().resourceId());
        Assertions.assertEquals("ejk", model.value().get(0).resourceMetadata().source());
        Assertions.assertEquals("ap", model.value().get(0).resourceMetadata().singular());
        Assertions.assertEquals("wgcu", model.value().get(0).resourceMetadata().plural());
        Assertions.assertEquals("tumkdosvqwhbm", model.value().get(0).description());
        Assertions.assertEquals("bbjfddgmbmbexp", model.value().get(0).label());
        Assertions.assertEquals("htqqrolfp", model.value().get(0).learnMoreLink());
        Assertions.assertEquals("s", model.value().get(0).potentialBenefits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceRecommendationBaseListResult model = new ResourceRecommendationBaseListResult().withNextLink("ufubl")
            .withValue(Arrays.asList(
                new ResourceRecommendationBaseInner().withCategory(Category.COST)
                    .withImpact(Impact.LOW)
                    .withImpactedField("aeqjhqjbasvms")
                    .withImpactedValue("qulngsntnbybkzgc")
                    .withLastUpdated(OffsetDateTime.parse("2021-05-07T11:10:21Z"))
                    .withMetadata(mapOf("jdous", "dataxxwr", "xbnjbiksq", "datacqvkocrcjdkwtn", "ainqpjwnzlljfm",
                        "datagls", "vmgxsab", "datapee"))
                    .withRecommendationTypeId("qduujitcjczdz")
                    .withShortDescription(new ShortDescription().withProblem("dhkrwpdappdsbdk").withSolution("rwjfe"))
                    .withSuppressionIds(Arrays.asList(UUID.fromString("cf861f59-54b4-4f32-b15b-132581e90998"),
                        UUID.fromString("f3591c80-7825-4739-94b5-5f29b359dfd1"),
                        UUID.fromString("ffb90a62-3cb3-46ff-9461-f82e651957ff"),
                        UUID.fromString("1e95b12a-cec3-4ebc-8283-7a88298f4953")))
                    .withExtendedProperties(mapOf("rl", "tjelt", "geablgphuticndvk", "hugjzzdatqxhoc", "ftyxolniw",
                        "ozwyiftyhxhuro", "ryplwckbasyypn", "wcukjfkgiawxk"))
                    .withResourceMetadata(new ResourceMetadata().withResourceId("sgcbac")
                        .withSource("ejk")
                        .withAction(mapOf("wyqkgfgibm", "datanqgoulzndli", "qsrxybzqqed", "datadgak", "iqfouflmmnkz",
                            "dataytb", "wtmutduq", "datamodmglougpb"))
                        .withSingular("ap")
                        .withPlural("wgcu"))
                    .withDescription("tumkdosvqwhbm")
                    .withLabel("bbjfddgmbmbexp")
                    .withLearnMoreLink("htqqrolfp")
                    .withPotentialBenefits("s")
                    .withActions(Arrays.asList(mapOf("gjyjgzjaoyfhrtxi", "dataqux", "rkujy", "datan"),
                        mapOf("juvf", "datal", "jkcpr", "dataawrlyx", "nruj", "datanwbxgjvtbvpyssz")))
                    .withRemediation(mapOf("uitnwuiz", "datahmuouqfprwzwbn", "x", "dataa", "hr", "datafizuckyf",
                        "zwdzuh", "dataidf"))
                    .withExposedMetadataProperties(mapOf("wxmnteiwao", "datawisdkft", "fsrpymzidnse",
                        "datavkmijcmmxdcuf", "yc", "datacxtbzsg", "mdwzjeiachboo", "datasne")),
                new ResourceRecommendationBaseInner().withCategory(Category.HIGH_AVAILABILITY)
                    .withImpact(Impact.LOW)
                    .withImpactedField("mnoh")
                    .withImpactedValue("ckwhds")
                    .withLastUpdated(OffsetDateTime.parse("2021-07-22T01:38:16Z"))
                    .withMetadata(mapOf("jxsqwpgrjbz", "datai"))
                    .withRecommendationTypeId("rcjxvsnbyxqabn")
                    .withShortDescription(new ShortDescription().withProblem("pcyshu").withSolution("afbljjgpbtoqcjmk"))
                    .withSuppressionIds(Arrays.asList(UUID.fromString("40f7c3ce-7323-4cfa-a559-713939d9530e")))
                    .withExtendedProperties(mapOf("pku", "qidtqajzyu", "gqexzlocxs", "jkrlkhbzhfepg"))
                    .withResourceMetadata(new ResourceMetadata().withResourceId("ierhhbcsglummaj")
                        .withSource("aodxo")
                        .withAction(mapOf("kajionpim", "datadxkqpx", "txgcpodgmaajr", "dataxg", "lwhijcoejctbzaq",
                            "datavdjwzrlovm"))
                        .withSingular("sycbkbfk")
                        .withPlural("kdkexxp"))
                    .withDescription("fmxa")
                    .withLabel("fjpgddtocjjxhvp")
                    .withLearnMoreLink("uexhdzx")
                    .withPotentialBenefits("qeojnxqbzvddntw")
                    .withActions(Arrays.asList(mapOf("hcffcyddglmjthjq", "datacbtwnpzaoqvuh", "hix",
                        "datawpyeicxmqciwqvh", "og", "dataigdtopbob")))
                    .withRemediation(mapOf("a", "dataw"))
                    .withExposedMetadataProperties(mapOf("iotkftutqxl", "datahrzayvvtpgvdf", "mi", "datagxlefgugnxkrxd",
                        "abhjybi", "datatthzrvqd"))));
        model = BinaryData.fromObject(model).toObject(ResourceRecommendationBaseListResult.class);
        Assertions.assertEquals("ufubl", model.nextLink());
        Assertions.assertEquals(Category.COST, model.value().get(0).category());
        Assertions.assertEquals(Impact.LOW, model.value().get(0).impact());
        Assertions.assertEquals("aeqjhqjbasvms", model.value().get(0).impactedField());
        Assertions.assertEquals("qulngsntnbybkzgc", model.value().get(0).impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-07T11:10:21Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("qduujitcjczdz", model.value().get(0).recommendationTypeId());
        Assertions.assertEquals("dhkrwpdappdsbdk", model.value().get(0).shortDescription().problem());
        Assertions.assertEquals("rwjfe", model.value().get(0).shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("cf861f59-54b4-4f32-b15b-132581e90998"),
            model.value().get(0).suppressionIds().get(0));
        Assertions.assertEquals("tjelt", model.value().get(0).extendedProperties().get("rl"));
        Assertions.assertEquals("sgcbac", model.value().get(0).resourceMetadata().resourceId());
        Assertions.assertEquals("ejk", model.value().get(0).resourceMetadata().source());
        Assertions.assertEquals("ap", model.value().get(0).resourceMetadata().singular());
        Assertions.assertEquals("wgcu", model.value().get(0).resourceMetadata().plural());
        Assertions.assertEquals("tumkdosvqwhbm", model.value().get(0).description());
        Assertions.assertEquals("bbjfddgmbmbexp", model.value().get(0).label());
        Assertions.assertEquals("htqqrolfp", model.value().get(0).learnMoreLink());
        Assertions.assertEquals("s", model.value().get(0).potentialBenefits());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
