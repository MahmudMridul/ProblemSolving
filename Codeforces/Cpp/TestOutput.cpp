//#pragma GCC optimize("Ofast")

#include <bits/stdc++.h>


#define fast ios_base::sync_with_stdio(false)
#define clr cin.tie(NULL)

#define i1(x) cin >> x
#define i2(x,y) cin >> x >> y
#define i3(x,y,z) cin >> x >> y >> z
#define i4(w,x,y,z) cin >> w >> x >> y >> z
#define i5(w,x,y,z,a) cin >> w >> x >> y >> z >> a
#define i6(w,x,y,z,a,b) cin >> w >> x >> y >> z >> a >> b
#define min_pq(x) priority_queue<x, vector<x>, greater<x> >
#define max_pq(x) priority_queue<x>
#define t_st clock_t start = clock();
#define t_en clock_t stop = clock();
#define t_p double duration = double(stop-start) / double(CLOCKS_PER_SEC); printf("%.10f\n",duration);

#define os(x) cout << x << " "
#define o(x) cout << x
#define ol(x) cout << x << "\n"

#define ulli unsigned long long int //64
#define lli long long int //64
#define uli unsigned long int //32
#define li long int //32
#define pi 3.1415926535897932384626433832795

using namespace std;

template<typename type>
void readArray(type arr[], int size)
{
    for(int i=0; i<size; ++i) { i1(arr[i]); }
}

template<typename type>
void readVector(vector<type>& vec, int size)
{
    for(int i=0; i<size; ++i) { type x; i1(x); vec.push_back(x); }
}

template<typename type>
void readSet(set<type>& list, int size)
{
    for(int i=0; i<size; ++i) { type x; i1(x); list.insert(x); }
}

template<typename type>
void printArray(type arr[], int n)
{
    for(int i=0; i<n; ++i) 
    {
        if(i == n-1) { ol(arr[i]); }
        else { os(arr[i]); } 
    } 
}

template<typename type>
void printVector(vector<type>& vec, int n)
{
    for(int i=0; i<n; ++i) 
    { 
        if(i == n-1) { ol(vec[i]); }
        else { os(vec[i]); } 
    }
}

template<typename type>
void printVectorPair(vector< pair<type, type> >& vec, int size)
{
    for(int i=0; i<size; ++i) { os(vec[i].first); ol(vec[i].second); }
}


int main()
{
    fast;
    clr;
    string str;
    vector<string> output;
    vector<string> expected;

    freopen("TextFiles/expected.txt", "r", stdin);

    while(getline(cin, str))
    {
        if(str.find("\n") != string :: npos)
        {
            str.erase(str.size() - 1, 1);
        }
        expected.push_back(str);
    }
    cin.clear();

    fclose(stdin);

    freopen("TextFiles/output.txt", "r", stdin);

    while(getline(cin, str))
    {
        if(str.find("\n") != string :: npos)
        {
            str.erase(str.size() - 1, 1);
        }
        output.push_back(str);
    }
    cin.clear();

    output.pop_back();

    fclose(stdin);

    freopen("TextFiles/testresult.txt", "w", stdout);

    if(output.size() != expected.size())
    {
        ol("Number of ouput generated and expected doesn't match");
        os("Number of output:"); ol(output.size());
        os("Expected number of output:"); ol(expected.size());
        return 0;
    }
    
    int count = 0;

    for(int test = 0; test < output.size(); ++test)
    {
        if(output[test] == expected[test])
        {
            ++count;
        }
        else 
        {
            ol(".");
            os("[Test case] :"); os(test + 1); ol("\t[FAILED]");
            os("[Ouput] :"); ol(output[test]);
            os("[Expected] :"); ol(expected[test]);
            ol(".");
        }
    }

    if(count == output.size())
    {
        ol("[ALL TESTS PASSED]");
    }


    return 0;
}
