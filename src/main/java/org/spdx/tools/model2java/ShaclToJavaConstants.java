/**
 * SPDX-FileCopyrightText: Copyright (c) 2024 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.tools.model2java;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Constants used in ShaclToJava - moved to a separate file since ShaclToJava was getting way to big!
 *
 * @author Gary O'Neall
 */
public class ShaclToJavaConstants {
	
	static final String SPDX_URI_PREFIX = "https://spdx.org/rdf/";
	static final String INDENT = "\t";
	public static final int COMMENT_LINE_LEN = 72;
	public static final String TYPE_PRED = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type";
	public static final String COMMENT_URI = "http://www.w3.org/2000/01/rdf-schema#comment";
	public static final String NAMED_INDIVIDUAL = "http://www.w3.org/2002/07/owl#NamedIndividual";
	public static final String LABEL_URI = "http://www.w3.org/2000/01/rdf-schema#label";
	public static final String RANGE_URI = "http://www.w3.org/2000/01/rdf-schema#range";
	public static final String BOOLEAN_TYPE = "http://www.w3.org/2001/XMLSchema#boolean";
	public static final String STRING_TYPE = "http://www.w3.org/2001/XMLSchema#string";
	public static final String ELEMENT_TYPE_SUFFIX = "/terms/Core/Element";
	public static final String ELEMENT_TYPE_ANY_LICENSE_INFO_SUFFIX = "/terms/Licensing/AnyLicenseInfo";
	public static final String ELEMENT_TYPE_EXTENDABLE_LICENSE_SUFFIX = "/terms/ExpandedLicensing/ExtendableLicense";
	public static final String ELEMENT_TYPE_LICENSE_ADDITION_SUFFIX = "/terms/ExpandedLicensing/LicenseAddition";
	public static final String DATE_TIME_TYPE = "http://www.w3.org/2001/XMLSchema#dateTimeStamp";
	public static final String ANY_URI_TYPE = "http://www.w3.org/2001/XMLSchema#anyURI";
	public static final String OWL_THING_URI = "http://www.w3.org/2002/07/owl#Thing";
	public static final String XSD_INTEGER = "http://www.w3.org/2001/XMLSchema#integer";
	public static final String XSD_POSITIVE_INTEGER = "http://www.w3.org/2001/XMLSchema#positiveInteger";
	public static final String XSD_NON_NEGATIVE_INTEGER = "http://www.w3.org/2001/XMLSchema#nonNegativeInteger";
	public static final String ABSTRACT_TYPE_URI = "http://spdx.invalid./AbstractClass";
	
	static final String TEMPLATE_CLASS_PATH = "resources" + "/" + "javaTemplates";
	static final String TEMPLATE_ROOT_PATH = "resources" + File.separator + "javaTemplates";
	public static final String JAVA_CLASS_TEMPLATE = "JavaClassTemplate.txt";
	public static final String ENUM_CLASS_TEMPLATE = "EnumTemplate.txt";
	public static final String SPDX_CONSTANTS_TEMPLATE = "SpdxConstantsTemplate.txt";
	public static final String UNIT_TEST_TEMPLATE = "UnitTestTemplate.txt";
	public static final String ENUM_FACTORY_TEMPLATE = "SpdxEnumFactoryTemplate.txt";
	public static final String INDIVIDUALS_FACTORY_TEMPLATE = "SpdxIndividualFactoryTemplate.txt";
	public static final String MODEL_CLASS_FACTORY_TEMPLATE = "ModelClassFactoryTemplate.txt";
	public static final String CREATE_CLASS_TEMPLATE = "CreateClassTemplate.txt";
	public static final String EXTERNAL_JAVA_CLASS_TEMPLATE = "ExternalJavaClassTemplate.txt";
	public static final String BASE_MODEL_OBJECT_TEMPLATE = "BaseModelObjectTemplate.txt";
	public static final String MODEL_INFO_TEMPLATE = "ModelInfoTemplate.txt";
	public static final String PACKAGE_INFO_TEMPLATE = "PackageInfoTemplate.txt";
	public static final String POM_TEMPLATE = "PomTemplate.txt";
	public static final String INDIVIDUAL_CLASS_TEMPLATE = "IndividualClassTemplate.txt";
	public static final String LICENSE_SET_EQUALS_OVERRIDE_TEMPLATE = "LicenseSetEqualsOverrideTemplate.txt";
	public static final String OR_LATER_EQUALS_OVERRIDE_TEMPLATE = "OrLaterEqualsOverrideTemplate.txt";
	public static final String WITH_EQUALS_OVERRIDE_TEMPLATE = "WithOperatorEqualsOverrideTemplate.txt";
	public static final String WITH_OPERATOR_TO_STRING_TEMPLATE = "WithOperatorToStringTemplate.txt";
	public static final String OR_LATER_TO_STRING_TEMPLATE = "OrLaterToStringTemplate.txt";
	public static final String LICENSE_SET_TO_STRING_TEMPLATE = "LicenseSetToStringTemplate.txt";
	public static final String ELEMENT_TO_STRING_TEMPLATE = "ElementToStringTemplate.txt";
	public static final String MOCK_MODEL_STORE_TEMPLATE = "MockModelStoreTemplate.txt";
	public static final String MOCK_COPY_MANAGER_TEMPLATE = "MockCopyManagerTemplate.txt";
	public static final String UNIT_TEST_HELPER_TEMPLATE = "UnitTestHelperTemplate.txt";
	public static final String TEST_VALUES_GENERATOR_TEMPLATE = "TestValuesGeneratorTemplate.txt";
	public static final String TEST_MODEL_INFO_TEMPLATE = "TestModelInfoTemplate.txt";
	public static final String INVALID_LICENSE_EXPRESSION_TEMPLATE = "InvalidLicenseExpressionTemplate.txt";
	
	/**
	 * XSD integer types whose value space fits in a Java Integer
	 */
	public static Set<String> BOUNDED_INTEGER_TYPES = new HashSet<>();
	static {
		BOUNDED_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#byte");
		BOUNDED_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#int");
		BOUNDED_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#short");
		BOUNDED_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#unsignedShort");
		BOUNDED_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#unsignedByte");
	}

	/**
	 * XSD integer types whose value space does not fit in a Java Integer - mapped to BigInteger
	 */
	public static Set<String> BIG_INTEGER_TYPES = new HashSet<>();
	static {
		BIG_INTEGER_TYPES.add(XSD_POSITIVE_INTEGER);
		BIG_INTEGER_TYPES.add(XSD_NON_NEGATIVE_INTEGER);
		BIG_INTEGER_TYPES.add(XSD_INTEGER);
		BIG_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#long");
		BIG_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#negativeInteger");
		BIG_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#nonPositiveInteger");
		BIG_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#unsignedLong");
		BIG_INTEGER_TYPES.add("http://www.w3.org/2001/XMLSchema#unsignedInt");
	}

	public static Set<String> INTEGER_TYPES = new HashSet<>();
	static {
		INTEGER_TYPES.addAll(BOUNDED_INTEGER_TYPES);
		INTEGER_TYPES.addAll(BIG_INTEGER_TYPES);
	}

	/**
	 * Value space bounds { min, max } of the XSD integer types - null for no bound
	 */
	public static Map<String, String[]> INTEGER_TYPE_BOUNDS = new HashMap<>();
	static {
		INTEGER_TYPE_BOUNDS.put(XSD_INTEGER, new String[] {null, null});
		INTEGER_TYPE_BOUNDS.put(XSD_NON_NEGATIVE_INTEGER, new String[] {"0", null});
		INTEGER_TYPE_BOUNDS.put(XSD_POSITIVE_INTEGER, new String[] {"1", null});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#nonPositiveInteger", new String[] {null, "0"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#negativeInteger", new String[] {null, "-1"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#long", new String[] {"-9223372036854775808", "9223372036854775807"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#int", new String[] {null, null}); // the Java Integer range
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#short", new String[] {"-32768", "32767"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#byte", new String[] {"-128", "127"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#unsignedLong", new String[] {"0", "18446744073709551615"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#unsignedInt", new String[] {"0", "4294967295"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#unsignedShort", new String[] {"0", "65535"});
		INTEGER_TYPE_BOUNDS.put("http://www.w3.org/2001/XMLSchema#unsignedByte", new String[] {"0", "255"});
	}

	public static Set<String> DOUBLE_TYPES = new HashSet<>();
	static {
		DOUBLE_TYPES.add("http://www.w3.org/2001/XMLSchema#decimal");
	}

	
	public static Map<String, String> RESERVED_JAVA_WORDS = new HashMap<>();
	static {
		RESERVED_JAVA_WORDS.put("Package", "SpdxPackage");
		RESERVED_JAVA_WORDS.put("package", "spdxPackage");
		RESERVED_JAVA_WORDS.put("File", "SpdxFile");
		RESERVED_JAVA_WORDS.put("file", "spdxFile");
		RESERVED_JAVA_WORDS.put("import", "spdxImport");
	}
	
	public static Set<String> SET_TYPE_SUFFIXES = new HashSet<>(); // set of suffixes for types should be treated as sets
	public static Set<String> SET_PROPERTY_SUFFIXES = new HashSet<>(); // set of suffixes for properties whose types should be treated as sets
	static {
		SET_PROPERTY_SUFFIXES.add("/terms/ExpandedLicensing/member");
	}
}
