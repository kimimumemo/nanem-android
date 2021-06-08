package com.example.nanem.data

import com.example.nanem.R

object dataTanah {

        private val tanahNames = arrayOf(
            "TANAH ALUVIAL",
            "TANAH ANDOSOL",
            "TANAH ENTISOL",
            "TANAH GRUMUSOL",
            "TANAH HUMUS",
            "TANAH LATERIT",
            "TANAH LATOSOL",
            "TANAH KAPUR"
        )

        private val tanahDetails = arrayOf(
                    "Asal: \n"+
                    "Endapan lumpur yang biasanya terbawa aliran sungai. \n\n" +
                    "Warna: \n"+
                    "Coklat hingga kelabu\n\n"+
                    "Bibit: \n"+
                    "Padi, palawija, tembakau\n\n"+
                    "Karakteristik: \n"+
                    "Lembut, mudah di garap\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Kalimantan, Sulawesi, Jawa hingga Papua\n\n"+
                    "Fakta unik: \n"+
                    "Tanah Aluvial cenderung memiliki pori halus yang dapat menyerap air dengan baik. " +
                            "Selain itu, biasanya tanah jenis ini bisa menyimpan air dalam jumlah yang cukup banyak. " +
                            "Dengan kata lain, musim kemarau bukanlah waktu yang \nsulit bagi tanah jenis ini. " +
                            "Masih ada sedikit cadangan air yang bisa diserap oleh tanaman bahkan saat musim kemarau.\n\n",

                    "Asal : \n"+
                    "Tanah vulkanis yang berasal dari gunung berapi. \n\n" +
                    "Warna: \n"+
                    "Hitam\n\n"+
                    "Bibit: \n"+
                    "Sayuran, palawija, tembakau, kopi, kayu manis, kina, teh.\n\n"+
                    "Karakteristik: \n"+
                    "Lempung berpasir hingga liat berpasir.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Sumatera, Jawa, Nusa Tenggara, Maluku, Sulawesi.\n\n"+
                    "Fakta unik: \n"+
                    "Andosol merupakan jenis tanah yang berasal dari material erupsi gunung berapi, " +
                            "sehingga tak heran jika penyebarannya terkonsentrasi di dataran tinggi mulai dari " +
                            "ketinggian 600 meter hingga 2000 meter dpl, namun ada pula tanah andosol pada dataran " +
                            "rendah di beberapa wilayah dengan ketinggian hingga 500 meter.  Karena bersifat subur, " +
                            "tanah ini banyak dimanfaatkan oleh orang untuk budidaya pertanian, " +
                            "itulah kenapa mata pencaharian utama penduduk didaerah yang banyak terdapat andosol " +
                            "umumnya petani sayur, palawija ataupun produk holtikultura lainnya.\n\n",

                    "Asal : \n"+
                    "Lereng curam, dataran banjir dan dunes. \n\n" +
                    "Warna: \n"+
                    "Abu-abu\n\n"+
                    "Bibit: \n"+
                    "Padi, palawija, tebu.\n\n"+
                    "Karakteristik: \n"+
                    "Tekstur yang kasar dengan kadar organik dan nitrogen rendah, " +
                            "tanah ini mudah teroksidasi dengan udara, kelembapan dan pH tanah entisol selalu berubah.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Jawa.\n\n"+
                    "Fakta unik: \n"+
                    "Keunggulan jenis tanah ini secara fisik adalah memiliki drainase " +
                            "dan aerasi yang baik. Untuk kelemahan tanah ini adalah miskin " +
                            "bahan organik dan juga hara tanah khususnya nitrogen. Pengelolaan " +
                            "untuk jenis tanah ini sebaiknya perlu memperkaya bahan organiknya, " +
                            "sedangkan untuk memperbaiki struktur tanah yang porous dan juga sebagai" +
                            " sumber hara N. Disamping itu juga meminimalkan kehilangan hara karena " +
                            "sifat porous tanah ini.\n\n",

                    "Asal : \n"+
                    "Batuan induk kapur dan tuffa vulkanik. \n\n" +
                    "Warna: \n"+
                    "Kelabu hingga hitam.\n\n"+
                    "Bibit: \n"+
                    "Padi, palawija, singkong.\n\n"+
                    "Karakteristik: \n"+
                    "Sedikit keras, mudah dibentuk dan mudah pecah atau hancur. " +
                            "Untuk lapisan atas berbentuk seperti granuler dengan ukuran" +
                            " yang sedikit lebih besar dari pasir, bentuk granuler tersebut" +
                            " sering terlihat berbentuk seperti bunga kubis (cauli flower structure)" +
                            " sedangkan pada lapisan bagian dalam bergumpal gumpal atau bisa dikatakan pejal.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Jawa Tengah, Jawa Timur, Nusa Tenggara Timur.\n\n"+
                    "Fakta unik: \n"+
                    "Komposisi mineral yang terdapat pada tanah grumusol tergantung " +
                            "dari bahan batuan induknya serta beberapa faktor luar selama proses" +
                            " pembentukannya dan komposisi fraksi liat sama pada semua jenis grumusol" +
                            " yang didominasi oleh mineral smektit. Tingginya kadar kalsium dan " +
                            "magnesium juga perlu diperhatikan terutama pada tanah grumusol yang akan" +
                            " dijadikan areal pertanian karena Ca berasosiasi dengan kandungan kapur" +
                            " yang justu akan meracuni tanaman. Tanah ini masih berpotensi untuk diolah " +
                            "manusia dengan melakukan berbagai perbaikan atau normalisasi terhadap kandungan " +
                            "unsur mineral didalamnya. Tanah grumsol bisa dijadikan areal persawahan dengan sistem " +
                            "irigasi ataupun dapat dijadikan kolam budidaya ikan air tawar.\n\n",

                    "Asal : \n"+
                    "Terbentuk dari pelapukan-pelapukan dedaunan dan juga batang pohon, " +
                            "serta ada percampuran dari kotoran hewan. \n\n"+
                    "Warna: \n"+
                    "Cokelat kehitaman.\n\n"+
                    "Bibit: \n"+
                    "Sayuran dan tanaman.\n\n"+
                    "Karakteristik: \n"+
                    "Sangat subur, tekstur yang gembur, biasanya terdapat pada lapisan" +
                            " bagian atas tanah, sehingga bersifat tidak stabil. Mempunyai daya" +
                            " serap yang tinggi dan mempunyai kemampuan menambah atau meningkatkan" +
                            " kandungan berbagai unsur hara (magnesium, kalsium, dan kalium).\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Sumatra, Kalimantan, Jawa, Papua, dan sebagian Pulau Sulawesi.\n\n"+
                    "Fakta unik: \n"+
                    "Tanah humus ini memiliki kandungan unsur hara yang banyak dan bermanfaat bagi" +
                            " tanaman. Maka dari itu pemanfaatan dari tanah humus ini lebih bayak digunakan" +
                            " di bidang pertanian atau yang berhubungan dengan tanam- menanam. Selain dimanfaatkan" +
                            " sebagai bahan pembuat pupuk kompos, tanah humus ini juga dapat digunakan" +
                            " sebagai media tanam secara langsung. Tanah humus yang bersifat subur ini" +
                            " sangat baik juga jika digunakan sebagai media tanam langsung untuk berbagai " +
                            "tanaman. Tanaman yang ditanam pada tanah humus ini biasanya akan tumbuh menjadi" +
                            " tanaman yang subur dan baik.\n\n",

                    "Asal : \n"+
                    "Terbentuk dari proses tanah yang sudah tua. \n\n" +
                    "Warna: \n"+
                    "Merah.\n\n"+
                    "Bibit: \n"+
                    "Palawija , jagung, kelapa sawit, cengkeh, coklat dan juga kopi.\n\n"+
                    "Karakteristik: \n"+
                    "Sudah berumur tua atau sudah lama sekali, mengandung bahan organik tingkat rendah.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Kalimantan, Lampung, Jawa Barat dan juga provinsi Jawa.\n\n"+
                    "Fakta unik: \n"+
                    "Tanah laterit merupakan tanah hasil pencucian karena pengaruh suhu rendah dan curah hujan tinggi." +
                            " Karena proses pembentukannya melibatkan curah hujan yang tinggi, banyak mineral yang" +
                            " dibutuhkan tanaman jadi hilang dari tanah jenis ini. Tanah laterit memiliki ciri tidak" +
                            " subur karena banyak mengandung sisa oksidasi besi dan aluminium. " +
                            "Tanah jenis ini termasuk tanah yang sudah tua.\n\n",

                    "Asal : \n"+
                    "Terbentuk dari batuan beku yang berasal dari proses meletusnya gunung berapi " +
                            "dan juga sedimen keras dengan proses pelapukan kimia dan fisika yang belum sempurna. \n\n" +
                    "Warna: \n"+
                    "Kelabu cokelat kemerahan.\n\n"+
                    "Bibit: \n"+
                    "Rumput-rumputan, jagung, bunga edelweis.\n\n"+
                    "Karakteristik: \n"+
                    "Tidak terlalu tebal, merupakan jenis tanah baru, mempunyai penampang yang besar, " +
                            "berbentuk kerikil, pasir, dan bebatuan kecil. Sudah megalami perubahan " +
                            "struktur atau profil dari batuan asal dan mempunyai kandungan unsur hara yang sedikit sekali.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Kalimantan, Lampung, Jawa Barat dan juga provinsi Jawa.\n\n"+
                    "Fakta unik: \n"+
                    "Pemanfaatan tanah litosol yang ditemukan di Indonesia masih kurang maksimal. " +
                            "Tanah litosol tidak dimanfaatkan secara intens seperti jenis tanah yang lainnya." +
                            " Bahkan ada di daerah tertentu yang menjadikan tanah litosol ini hanya untuk lahan" +
                            " kosong yang dibiarkan untuk ditumbuhi rerumputan. Hal ini karena tanah litosol merupakan" +
                            " tanah yang kandungan unsur haranya hanya sedikit saja.\n\n",

                    "Asal : \n"+
                    "Terbentuk dari bebatuan kapur yang yang telah lapuk dan hancur. \n\n" +
                    "Warna: \n"+
                    "Putih.\n\n"+
                    "Bibit: \n"+
                    "Jati.\n\n"+
                    "Karakteristik: \n"+
                    "Tidak subur,tidak cocok digunakan sebagai lahan pertanian.\n\n"+
                    "Persebaran di Indonesia: \n"+
                    "Jawa Tengah, Jawa Timur, Nusa Tenggara dan juga Maluku.\n\n"+
                    "Fakta unik: \n"+
                    "Tanah kapur merupakan tanah yang bersifat sangat mudah dilalui oleh air. Maka dari" +
                            " itu jika kita terjun ke sungai, kita akan lebih sering  menemukan jenis" +
                            " tanah di bawah aliran sungai tersebut adalah jenis tanah kapur. " +
                            "Tanah kapur mempunyai fungsi dalam bidang pertanian sebagai  penurun" +
                            " tingkat keasaman pada tanah. Bagaimanapun juga, dalam bidang pertanian" +
                            " memerlukan tanah yang netral pada saat akan digunakan untuk menanam sesuatu." +
                            " Ketika tanah yang akan digunakan terlalu asam, maka dapat diturunkan dengan " +
                            "mengambil sedikit dari tanah kapaur ini kemudian campurkan pada tanah yang akan ditanami.\n\n"
        )

        private val tanahImages = intArrayOf(
                R.drawable.aluvial,
                R.drawable.andosol,
                R.drawable.entisol,
                R.drawable.grumosol,
                R.drawable.humus,
                R.drawable.laterit,
                R.drawable.latosol,
                R.drawable.litosol,
                R.drawable.kapur
        )

        val listData: ArrayList<Tanah>
            get() {
                val list = arrayListOf<Tanah>()
                for (position in tanahNames.indices) {
                    val tanah = Tanah()
                    tanah.name = tanahNames[position]
                    tanah.photo = tanahImages[position]
                    tanah.detail = tanahDetails[position]
                    list.add(tanah)
                }
                return list
            }
    }

    /*fun generatetanah(): List<Tanah> {
        val tanah = ArrayList<Tanah>()
        tanah.add(
            Tanah(
                    "tanah1",
                "Tanah Aluvial",
                "https://lh4.googleusercontent.com/bewyQGxXgX_bKwdVBpf79LrHTCDSJLhNzFzeDcPpO71wa4ska7VV8qbhFyuJ3UZBPUWbpjVwf1yKHxyVBedcyfT_vWe3ZDPmRRW4jCOq66RnJ8SkasiNjNmzyz56AZvEB3hvWHU",
                "Tanah aluvial ini merupakan jenis tanah yang terjadi karena endapan lumpur yang biasanya terbawa aliran sungai. Biasanya tanah ini ditemukan dibagian hilir atau daerah rendah.\n" +
                        "\n" +
                        "Untuk warna tanah ini coklat hingga kelabu. Tanah ini sifatnya itu subur dan cocok untuk pertanian baik itu buat padi, palawija, hingga tembakau. Bahkan bisa memberikan hasil yang baik. Tekstur tanahnya itu lembut dan mudah digarap, ini memudahkan untuk mengolahnya.\n" +
                        "\n" +
                        "Tanah ini tersebar banyak daerah di Indonesia, seperti Kalimantan, Sulawesi, Jawa, hingga Papua."
            )
        )
        tanah.add(
            Tanah(
                    "tanah2",
                "Tanah Andosol",
                "https://ahli-pengetahuan.web.id/wp-content/uploads/2019/04/pengertian-tanah-andosol.jpg",
                "Tanah andosol merupakan salah satu jenis tanah vulkanik dimana terbentuk karena adanya proses vulkanisme pada gunung berapi. Tanah ini sangat subur dan baik untuk tanaman. Warna dari tanah andosol coklat keabu-an. Tanah ini sangat kaya dengan mineral, unsure hara, air dan mineral sehingga sangat baik untuk tanaman. Tanah ini sangat cocok untuk segala jenis tanaman yang ada di dunia. persebaran tanah andosol biasanya terdapat di daerah yang dekat dengan gunung berapi.\n" +
                        "\n" +
                        "Biasanya tanah ini terdapat daerah yang memiliki iklim basah dan curah hujan yang tinggi, oleh karena itu tanah ini sering dijumpai di wilayah yang merupakan cincin api terbanyak seperti di pulau Jawa, Bali, Sumatra dan Nusa Tenggara. "

            )
        )
        tanah.add(
            Tanah(
                    "tanah3",
                "Tanah Entisol",
                "https://www.pinterpandai.com/wp-content/uploads/2019/01/Tanah-entisol.jpg",
                "Tanah entisol merupakan saudara dari tanah andosol namun biasaya merupakan pelapukan dari material yang dikeluarkan oleh letusan gunung berapi seperti debu, pasir, lahar, dan lapili. Tanah ini juga sangat subur dan merupakan tipe tanah yang masih muda. Tanah ini biasanya ditemukan tidak jauh dari area gunung berapi bisa berupa permukaan tanah tipis yang belum memiliki lapisan tanah dan berupa gundukan pasir seperti yang ada di pantai parangteritis Jogjakarta.\n" +
                        "\n" +
                        "Biasanya tanah ini ditemukan tidak jauh dari area gunung berapi seperti di Pantai Parangteritis Jogjakarta, dan Daerah Jawa lainnya yang memiliki banyak gunung berapi dan bisanya bisa berupa tanah tipis yang belum memiliki lapisan tanah dan berupa gundukan. "
            )
        )

        tanah.add(
            Tanah(
                    "tanah4",
                "Tanah Grumosol",
                "https://ilmugeografi.com/wp-content/uploads/2015/11/grumusol.png",
                "Jenis tanah ini terbentuk dari pelapukan batuan kapur dan tuffa vulkanik. Kandungan bahan organik di dalamnya tergolong rendah karena tanah ini terdiri dari batuan kapur. Dapat disimpulkan bahwa tanah grumusol ini tidak subur dan tidak cocok untuk ditanami tanaman.\n" +
                        "\n" +
                        "Biasanya tanah ini sering diijumpai di Tanah grumusol banyak terdapat di daerah Jawa Tengah (Demak, Jepara, Pati, Rembang), Jawa Timur (Ngawi, Madiun) dan Nusa Tenggara Timur."


            )
        )

        tanah.add(
            Tanah(
                    "tanah5",
                "Tanah Humus",
                "https://mediatani.co/wp-content/uploads/2018/03/humus.jpg",
                "Tanah humus merupakan tanah yang terbentuk dari pelapukan tumbuh-tumbuhan. Mengandung banyak unsur hara dan mineral dan sangat subur. Kandungan yang subur ini sangat cocok untuk tanaman. Untuk warnanya itu agak kehitam-hitaman dan bisa ditemukan di daerah banyak hutan.\n" +
                        "\n" +
                        "Biasanya tanah ini ditemukan di daerah yang ada banyak hutan, seperti daerah Sumatera, Kalimantan, Jawa, Papua dan sebagian wilayah dari Sulawesi.",


                )
        )

        tanah.add(
            Tanah(
                    "tanah6",
                "Tanah Inceptisol",
                "https://www.dictio.id/uploads/db3342/original/3X/f/0/f050b8042371d7752843d272f6399c5856be7450.jpeg",
                "Jenis tanah ini terbentuk dari batuan sedimen atau metamorf. Tanah inseptisol berwarna agak kecoklatan dan kehitaman serta campuran yang agak keabu-abuan. Tanah ini juga dapat menopang pembentukan hutan yang asri.\n" +
                        "\n" +
                        "Biasnya tanah ini sering dijumpai di daerah yang bertanah inseptiosl yaitu pada daerah Sumatera, Kalimantan dan Papua."

            )
        )

        tanah.add(
            Tanah(
                    "tanah7",
                "Tanah Laterit",
                "https://i0.wp.com/stockistnasa.net/wp-content/uploads/2017/07/tanah-laterit.jpg?w=1067&ssl=1",
                "Jenis tanah ini mengandung banyak zat besi dan alumunium. Karena kandungannya, tanah laterit berwarna merah bata. Di Indonesia, tanah laterit cukup familiar, terutama di daerah desa dan perkampungan.\n" +
                        "\n" +
                        "Tanah ini sangat cocok untuk perkebunan seperti kelapa sawit maupun karet. Oleh karena itu banyak tersebar diberbagai daerah di Indonesia, seperti Sumatera, Kalimantan, dan Papua."
            )
        )

        tanah.add(
            Tanah(
                    "tanah8",
                "Tanah Latosol",
                "https://materigeografi.com/wp-content/uploads/2019/11/tanah-latosol.jpg",
                "Jenis tanah ini juga salah satu yang terdapat di Indonesia, tanah ini terbentuk dari pelapukan batuan sedimen dan metamorf. Tanah ini memiliki butiran kasar dan kerikil. Biasanya persebaran tanah latosol ini berada di daerah Sulawesi, lampung, Kalimantan timur dan barat, Bali dan Papua."
            )
        )

        tanah.add(
            Tanah(
                    "tanah9",
                "Tanah Litosol",
                "https://lh4.ggpht.com/-xmvhnLt5ThU/Uc7iuaika3I/AAAAAAAAGcY/bxJokw0_EHI/Tanah%252520Litosol%25255B3%25255D.jpg?imgmax=800",
                "Tanah litosol merupakan tanah yang baru mengalami perkembangan dan merupakan tanah yang masih muda. Terbentuk dari adanya perubahan iklim, topografi dan adanya vulkanisme. Biasanya terdapat pada daerah yang memiliki tingkat kecuraman tinggi seperti di bukit tinggi, nusa tenggara barat, Jawa tengah, Jawa Barat dan Sulawesi."
                )
        )

        tanah.add(
            Tanah(
                    "tanah10",
                "Tanah Kapur",
                "https://ilmugeografi.com/wp-content/uploads/2018/02/5d9d1adb-tanah-kapur.jpeg",
                "Seperti dengan namanya tanah kapur berasal dari batuan kapur yang mengalami pelapukan. Tanah kapur tersebar di daerah yang kering seperti di gunung kidul Yogyakarta, dan di daerah pegunungan kapur seperti di Jawa Tengah, Jawa Barat, Nusa Tenggara Timur."
                )
        )
        
        return tanah
    }
}*/