# Dizi: [22, 27, 16, 2, 18, 6]

# Adım 1: [22, 27, 16, 2, 18, 6] (Başlangıç)
# Adım 2: [22, 27, 16, 2, 18, 6] (27, 22'den büyük olduğu için yer değiştirmez)
# Adım 3: [16, 22, 27, 2, 18, 6] (16, 22 ve 27'den küçük olduğu için 22 ile yer değiştirir)
# Adım 4: [2, 16, 22, 27, 18, 6] (2, 16, 22 ve 27'den küçük olduğu için uygun pozisyona yerleştirilir)
# Adım 5: [2, 16, 18, 22, 27, 6] (18, 22 ve 27'den küçük olduğu için uygun pozisyona yerleştirilir)
# Adım 6: [2, 6, 16, 18, 22, 27] (6, 16, 18, 22 ve 27'den küçük olduğu için uygun pozisyona yerleştirilir)

# Dizi Insertion Sort ile sıralandıktan sonra:

# Sıralı Dizi: [2, 6, 16, 18, 22, 27]

# Big-O Gösterimi: O(n^2)

# 18 sayısı için:
# Ortalama durum: Aranan sayının dizinin ortasında olma olasılığı yüksektir, bu nedenle ortalama durumda arama yaparken daha az adım gerekecektir.
# En kötü durum: Aranan sayı dizinin sonunda olduğunda, en kötü durumda tüm diziyi kontrol etmek gerekecektir.
# En iyi durum: Aranan sayı dizinin başında olduğunda, en iyi durumda sadece birkaç adım gerekecektir.

# [7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin Selection Sort algoritması kullanılarak ilk 4 adımı şu şekildedir:

# Adım 1: [2, 3, 5, 8, 7, 9, 4, 15, 6] (En küçük elemanı 2 olduğu için ilk sıraya yerleştirilir)
# Adım 2: [2, 3, 4, 8, 7, 9, 5, 15, 6] (En küçük ikinci elemanı 4 olduğu için ikinci sıraya yerleştirilir)
# Adım 3: [2, 3, 4, 5, 7, 9, 8, 15, 6] (En küçük üçüncü elemanı 5 olduğu için üçüncü sıraya yerleştirilir)
# Adım 4: [2, 3, 4, 5, 6, 9, 8, 15, 7] (En küçük dördüncü elemanı 6 olduğu için dördüncü sıraya yerleştirilir)
