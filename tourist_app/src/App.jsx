import * as React from "react";
import './App.css';
import './InputSelectCombined.css';
import 'react-date-range/dist/styles.css'; // main style file
import 'react-date-range/dist/theme/default.css'; // theme css file
import { Calendar } from 'react-date-range';
const App = () => {
	const [selected, setSelected] = React.useState("Choose the country");
	const [selectedCity, setSelectedCity] = React.useState("Choose the city");
	const [placeToAdd, setPlaceToAdd] = React.useState("");
	const [addedPlaces, setAddedPlaces] = React.useState([]);

	const changeSelectOptionHandler = (event) => {
		setSelected(event.target.value);
	};

	const changeSelectCityOptionHandler = (event) => {
		setSelectedCity(event.target.value);
	};

	const addPlace = () => {
		if (placeToAdd !== "" && !addedPlaces.includes(placeToAdd)) {
			setAddedPlaces([...addedPlaces, placeToAdd]);
			setPlaceToAdd("");
		}
	};

	const deletePlace = (text) => {
		const newPlaces = addedPlaces.filter((place) => {
			return place !== text;
		});
		setAddedPlaces(newPlaces);
	}
	const handleSelectDate = (date) => {
		console.log(date); // native Date object
	  }

	const countries = ['Czech Republic', 'Slovakia'];
	const citiesCZ = ['Prague', 'Brno'];
	const citiesSK = ['Bratislava', 'Kosice'];

	const placesCZPRG = ['Medium 43', 'Dejvice'];
	const placesCZBRN = ['Dhruv', 'Borsch'];
	const placesSKBRA = ['Mountainous Monument', 'Bratislava City'];
	const placesSKKOS = ['Hackathon', 'Beer'];

	const hotelsPRG = ['Hotel 1 Prague', 'Hotel 2 Prague', 'Private Apartments 1 Prague'];
	const hotelsBRN = ['Hotel 1 Brno', 'Hotel 2 Brno', 'Private Apartments 1 Brno'];
	const hotelsBRA = ['Hotel 1 Bratislava', 'Hotel 2 Bratislava', 'Private Apartments 1 Bratislava'];
	const hotelsKOS = ['Hotel 1 Kosice', 'Hotel 2 Kosice', 'Private Apartments 1'];

	let country = null;

	let cities = null;

	switch (selected) {
		case 'Czech Republic':
			country = citiesCZ;
			break;
		case 'Slovakia':
			country = citiesSK;
			break;
		default:
			console.log('It was ' + selected);
	}
	if (country) {
		cities = country.map((el) => <option key={el}>{el}</option>);
	}

	let city = null;
	let hotel = null;

	let places = null;
	let hotels = null;

	switch (selectedCity) {
		case 'Prague':
			city = placesCZPRG;
			hotel = hotelsPRG;
			console.log('Czech Republic');
			break;
		case 'Brno':
			city = placesCZBRN;
			hotel = hotelsBRN;
			console.log('Slovakia');
			break;
		case 'Bratislava':
			city = placesSKBRA;
			hotel = hotelsBRA;
			console.log('Slovakia');
			break;
		case 'Kosice':
			city = placesSKKOS;
			hotel = hotelsKOS;
			console.log('Slovakia');
			break;
		default:
			console.log('It was ' + selectedCity);
	}
	if (city) {
		places = city.map((el) => <option key={el}>{el}</option>);
		hotels = hotel.map((el) => <option key={el}>{el}</option>);
	}

	return (

		<div className="App">
			<form>
				<div>
				<Calendar
        date={new Date()}
        onChange={handleSelectDate}
      />
				</div>
				<div>
					<select id="selectoption" onChange={changeSelectOptionHandler}>
						<option>Choose the country</option>
						{countries.map(country => <option>{country}</option>)}
					</select>
				</div>
				<div>
					<select onChange={changeSelectCityOptionHandler}>
						<option>Choose the city</option>
						{cities}
					</select>
				</div>
				<div>
					<select value={placeToAdd} onChange={(e) => {setPlaceToAdd(e.target.value); console.log(e.target.value) }}>
						{places}
					</select>
				</div>
				<div>
					<select>
						{hotels}
					</select>
				</div>

			</form>
			{addedPlaces?.length > 0 ? (
				<div>
					<ul className="placeToAdd-list">
						{addedPlaces.map((place, index) => (
							<div className="addedPlaces">
								<li key={index}> {place} </li>

								<button className="delete-button" onClick={() => {
									deletePlace(place);
								}}>Delete</button>
							</div>
						))}
					</ul>
				</div>) : (
				<div className="empty">
					<p>No places added yet</p>
				</div>
			)}
			<button className="add-button" onClick={addPlace}>Add Place</button>
		</div>
	);
}

export default App;
