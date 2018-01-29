package org.axonframework.queryhandling.responsetypes;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class MultipleInstancesResponseTypeTest
        extends AbstractResponseTypeTest<List<AbstractResponseTypeTest.QueryResponse>> {

    public MultipleInstancesResponseTypeTest() {
        super(new MultipleInstancesResponseType<>(QueryResponse.class));
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsTheSame() throws NoSuchMethodException {
        testMatches("someQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsSubTypeOfProvidedType() throws NoSuchMethodException {
        testMatches("someSubTypedQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsSuperTypeOfProvidedType() throws NoSuchMethodException {
        testMatches("someSuperTypedQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsUnboundedGeneric() throws NoSuchMethodException {
        testMatches("someUnboundedGenericQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsBoundedGenericOfProvidedType() throws NoSuchMethodException {
        testMatches("someBoundedGenericQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsMultiBoundedGenericOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someMultiBoundedGenericQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsGenericOfOtherType() throws NoSuchMethodException {
        testMatches("someNonMatchingBoundedGenericQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsArrayOfProvidedType() throws NoSuchMethodException {
        testMatches("someArrayQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsArrayWithSubTypeOfProvidedType() throws NoSuchMethodException {
        testMatches("someSubTypedArrayQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsArrayWithSuperTypeOfProvidedType() throws NoSuchMethodException {
        testMatches("someSuperTypedArrayQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsUnboundedGenericArray() throws NoSuchMethodException {
        testMatches("someUnboundedGenericArrayQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsBoundedGenericArrayOfProvidedType() throws NoSuchMethodException {
        testMatches("someBoundedGenericArrayQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsMultiBoundedGenericArrayOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someMultiBoundedGenericArrayQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsGenericArrayOfOtherType() throws NoSuchMethodException {
        testMatches("someNonMatchingBoundedGenericArrayQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsListOfProvidedType() throws NoSuchMethodException {
        testMatches("someListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsSubListOfProvidedType() throws NoSuchMethodException {
        testMatches("someSubListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsSuperListOfProvidedType() throws NoSuchMethodException {
        testMatches("someSuperListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsBoundedGenericListOfProvidedType() throws NoSuchMethodException {
        testMatches("someBoundedGenericListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsUnboundedGenericList() throws NoSuchMethodException {
        testMatches("someUnboundedGenericListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsMultiBoundedGenericListOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someMultiBoundedGenericListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsGenericListOfOtherType() throws NoSuchMethodException {
        testMatches("someNonMatchingBoundedGenericListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsUnboundedWildcardList() throws NoSuchMethodException {
        testMatches("someUnboundedWildcardListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsLowerBoundedWildcardList() throws NoSuchMethodException {
        testMatches("someLowerBoundedWildcardListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsUpperBoundedWildcardListOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someUpperBoundedWildcardListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsWildcardListOfOtherType() throws NoSuchMethodException {
        testMatches("someNonMatchingUpperBoundedWildcardQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsGenericUpperBoundedWildcardListOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someGenericUpperBoundedWildcardListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsMultiGenericUpperBoundedWildcardListOfProvidedType()
            throws NoSuchMethodException {
        testMatches("someMultiGenericUpperBoundedWildcardListQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsUnboundedGenericUpperBoundedWildcardList()
            throws NoSuchMethodException {
        testMatches("someUnboundedGenericUpperBoundedWildcardListQuery", DOES_NOT_MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsSetOfProvidedType() throws NoSuchMethodException {
        testMatches("someSetQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsTrueIfResponseTypeIsStreamOfProvidedType() throws NoSuchMethodException {
        testMatches("someStreamQuery", MATCHES);
    }

    @Test
    public void testMatchesReturnsFalseIfResponseTypeIsMapOfProvidedType() throws NoSuchMethodException {
        testMatches("someMapQuery", DOES_NOT_MATCHES);
    }

    @SuppressWarnings("unused")
    @Test(expected = Exception.class)
    public void testConvertThrowsExceptionForSingleInstanceResponse() {
        List<QueryResponse> result = testSubject.convert(new QueryResponse());
    }

    @Test
    public void testConvertReturnsListOnResponseOfArrayType() {
        QueryResponse[] testResponse = new QueryResponse[]{new QueryResponse()};

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertEquals(testResponse.length, result.size());
        assertEquals(testResponse[0], result.get(0));
    }

    @Test
    public void testConvertReturnsListOnResponseOfSubTypedArrayType() {
        SubTypedQueryResponse[] testResponse = new SubTypedQueryResponse[]{new SubTypedQueryResponse()};

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertEquals(testResponse.length, result.size());
        assertEquals(testResponse[0], result.get(0));
    }

    @SuppressWarnings("unused")
    @Test(expected = Exception.class)
    public void testConvertThrowsExceptionForResponseOfDifferentArrayType() {
        QueryResponseInterface[] testResponse = new QueryResponseInterface[]{new QueryResponseInterface() {}};

        List<QueryResponse> result = testSubject.convert(testResponse);
    }

    @Test
    public void testConvertReturnsListOnResponseOfListType() {
        List<QueryResponse> testResponse = new ArrayList<>();
        testResponse.add(new QueryResponse());

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertEquals(testResponse.size(), result.size());
        assertEquals(testResponse.get(0), result.get(0));
    }

    @Test
    public void testConvertReturnsListOnResponseOfSubTypedListType() {
        List<SubTypedQueryResponse> testResponse = new ArrayList<>();
        testResponse.add(new SubTypedQueryResponse());

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertEquals(testResponse.size(), result.size());
        assertEquals(testResponse.get(0), result.get(0));
    }

    @Test
    public void testConvertReturnsListOnResponseOfSetType() {
        Set<QueryResponse> testResponse = new HashSet<>();
        testResponse.add(new QueryResponse());

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertEquals(testResponse.size(), result.size());
        assertEquals(testResponse.iterator().next(), result.get(0));
    }

    @SuppressWarnings("unused")
    @Test(expected = Exception.class)
    public void testConvertThrowsExceptionForResponseOfDifferentListType() {
        List<QueryResponseInterface> testResponse = new ArrayList<>();
        testResponse.add(new QueryResponseInterface() {});

        List<QueryResponse> result = testSubject.convert(testResponse);
    }

    @Test
    public void testConvertReturnsEmptyListForResponseOfDifferentListTypeIfTheListIsEmpty() {
        List<QueryResponseInterface> testResponse = new ArrayList<>();

        List<QueryResponse> result = testSubject.convert(testResponse);

        assertTrue(result.isEmpty());
    }
}
