
using System.Text;

namespace CSh.Easy
{
    public class LongestCommonPrefix_14
    {
        // 91ms 40.22MB
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
                    if (first != strs[j][i])
                    {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon)
                {
                    result.Append(first);
                }
                else { break; }
            }
            return result.ToString();
        }
    }
}
