package com.example.nanem.data

import com.example.nanem.R

object dataTanah {

        private val tanahNames = arrayOf(
            "TANAH ALUVIAL",
            "TANAH ANDOSOL",
            "TANAH ENTISOL",
            "TANAH GRUMUSOL",
            "TANAH HUMUS",
            "TANAH INCEPTISOL",
            "TANAH LATERIT",
            "TANAH LATOSOL",
            "TANAH LITOSOL",
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
                    "Tanah Aluvial cenderung memiliki pori halus yang dapat menyerap air dengan baik. Selain itu, biasanya tanah jenis ini bisa menyimpan air dalam jumlah yang cukup banyak. Dengan kata lain, musim kemarau bukanlah waktu yang \nsulit bagi tanah jenis ini. Masih ada sedikit cadangan air yang bisa diserap oleh tanaman bahkan saat musim kemarau.\n\n",
            "Tanah andosol merupakan salah satu jenis tanah vulkanik dimana terbentuk karena adanya proses vulkanisme pada gunung berapi. Tanah ini sangat subur dan baik untuk tanaman. Warna dari tanah andosol coklat keabu-an. Tanah ini sangat kaya dengan mineral, unsure hara, air dan mineral sehingga sangat baik untuk tanaman. Tanah ini sangat cocok untuk segala jenis tanaman yang ada di dunia. persebaran tanah andosol biasanya terdapat di daerah yang dekat dengan gunung berapi.\n" + "\n" + "Biasanya tanah ini terdapat daerah yang memiliki iklim basah dan curah hujan yang tinggi, oleh karena itu tanah ini sering dijumpai di wilayah yang merupakan cincin api terbanyak seperti di pulau Jawa, Bali, Sumatra dan Nusa Tenggara.",
            "Tanah entisol merupakan saudara dari tanah andosol namun biasaya merupakan pelapukan dari material yang dikeluarkan oleh letusan gunung berapi seperti debu, pasir, lahar, dan lapili. Tanah ini juga sangat subur dan merupakan tipe tanah yang masih muda. Tanah ini biasanya ditemukan tidak jauh dari area gunung berapi bisa berupa permukaan tanah tipis yang belum memiliki lapisan tanah dan berupa gundukan pasir seperti yang ada di pantai parangteritis Jogjakarta.\n" + "\n" + "Biasanya tanah ini ditemukan tidak jauh dari area gunung berapi seperti di Pantai Parangteritis Jogjakarta, dan Daerah Jawa lainnya yang memiliki banyak gunung berapi dan bisanya bisa berupa tanah tipis yang belum memiliki lapisan tanah dan berupa gundukan.",
            "Jenis tanah ini terbentuk dari pelapukan batuan kapur dan tuffa vulkanik. Kandungan bahan organik di dalamnya tergolong rendah karena tanah ini terdiri dari batuan kapur. Dapat disimpulkan bahwa tanah grumusol ini tidak subur dan tidak cocok untuk ditanami tanaman.\n" + "\n" + "Biasanya tanah ini sering diijumpai di Tanah grumusol banyak terdapat di daerah Jawa Tengah (Demak, Jepara, Pati, Rembang), Jawa Timur (Ngawi, Madiun) dan Nusa Tenggara Timur.",
            "Tanah humus merupakan tanah yang terbentuk dari pelapukan tumbuh-tumbuhan. Mengandung banyak unsur hara dan mineral dan sangat subur. Kandungan yang subur ini sangat cocok untuk tanaman. Untuk warnanya itu agak kehitam-hitaman dan bisa ditemukan di daerah banyak hutan.\n" + "\n" + "Biasanya tanah ini ditemukan di daerah yang ada banyak hutan, seperti daerah Sumatera, Kalimantan, Jawa, Papua dan sebagian wilayah dari Sulawesi",
            "Jenis tanah ini terbentuk dari batuan sedimen atau metamorf. Tanah inseptisol berwarna agak kecoklatan dan kehitaman serta campuran yang agak keabu-abuan. Tanah ini juga dapat menopang pembentukan hutan yang asri.\n" + "\n" + "Biasnya tanah ini sering dijumpai di daerah yang bertanah inseptiosl yaitu pada daerah Sumatera, Kalimantan dan Papua.",
            "Jenis tanah ini mengandung banyak zat besi dan alumunium. Karena kandungannya, tanah laterit berwarna merah bata. Di Indonesia, tanah laterit cukup familiar, terutama di daerah desa dan perkampungan.\n" + "\n" + "Tanah ini sangat cocok untuk perkebunan seperti kelapa sawit maupun karet. Oleh karena itu banyak tersebar diberbagai daerah di Indonesia, seperti Sumatera, Kalimantan, dan Papua.",
            "Jenis tanah ini juga salah satu yang terdapat di Indonesia, tanah ini terbentuk dari pelapukan batuan sedimen dan metamorf. Tanah ini memiliki butiran kasar dan kerikil. Biasanya persebaran tanah latosol ini berada di daerah Sulawesi, lampung, Kalimantan timur dan barat, Bali dan Papua.",
            "Tanah litosol merupakan tanah yang baru mengalami perkembangan dan merupakan tanah yang masih muda. Terbentuk dari adanya perubahan iklim, topografi dan adanya vulkanisme. Biasanya terdapat pada daerah yang memiliki tingkat kecuraman tinggi seperti di bukit tinggi, nusa tenggara barat, Jawa tengah, Jawa Barat dan Sulawesi.",
            "Seperti dengan namanya tanah kapur berasal dari batuan kapur yang mengalami pelapukan. Tanah kapur tersebar di daerah yang kering seperti di gunung kidul Yogyakarta, dan di daerah pegunungan kapur seperti di Jawa Tengah, Jawa Barat, Nusa Tenggara Timur."
        )

        private val tanahImages = intArrayOf(
                R.drawable.aluvial,
                R.drawable.andosol,
                R.drawable.entisol,
                R.drawable.grumosol,
                R.drawable.humus,
                R.drawable.inseptisol,
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