
using System.Text;

namespace CSh
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string[] testStr = { "doggo", "dogu", "dogp" };
            Solution solution = new Solution();
            string result = solution.LongestCommonPrefix(testStr);
            //Console.WriteLine(result);
            string exm = "somestring";
            Console.WriteLine(exm.Remove(2));

            
        }

       
    }

    public class Solution
    {
        public string LongestCommonPrefix(string[] strs)
        {
            StringBuilder result = new StringBuilder();
            int minLength = strs.Min(str => str.Length);

            for (int i = 0; i < minLength; ++i)
            {
                char first = strs[0][i];
                bool isCommon = true;
                for (int j = 1; j < strs.Length; ++j)
                {
                    if(first != strs[j][i])
                    {
                        isCommon = false;
                        break;
                    }
                }
                if(isCommon)
                {
                    result.Append(first);
                }
                else { break; }
            }
            return result.ToString();
        }
    }
}